package com.my.elasticsearch.entity.es;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
/** ES注解 **/
/**
 * useServerConfiguration 默认使用线上的 es 配置，防止应用中 es 配置修改后会自动同步到线上
 * createIndex 不要根据实体类的变更而去更改线上 es 的索引
 */
@Document(indexName = "blog", type = "_doc", useServerConfiguration = true, createIndex = false)
public class EsBlog {
    @Id
    private Integer id;

    /** 标题 **/
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String title;

    /** 作者 **/
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String author;

    /** 内容 **/
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String content;

    /** 创建时间 **/
    /** DateFormat.custom 是指使用用户自定义 pattern 的方式格式化日期 **/
    @Field(type = FieldType.Date, format = DateFormat.custom, pattern = "yyyy-MM-dd HH:mm:ss||yyyy-MM-dd||epoch_millis")
    @JsonAlias(value = "create_time")
    private Date createTime;

    /** 修改时间 **/
    @Field(type = FieldType.Date, format = DateFormat.custom, pattern = "yyyy-MM-dd HH:mm:ss||yyyy-MM-dd||epoch_millis")
    @JsonAlias(value = "update_time")
    private Date updateTime;
}
