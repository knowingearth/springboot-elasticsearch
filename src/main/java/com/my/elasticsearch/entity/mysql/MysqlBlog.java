package com.my.elasticsearch.entity.mysql;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "t_blog")
public class MysqlBlog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    /** 标题 **/
    @Basic
    @Column(name = "title", nullable = false)
    private String title;

    /** 作者 **/
    @Basic
    @Column(name = "author", nullable = false)
    private String author;

    /** 内容 **/
    @Basic
    @Column(name = "content", nullable = false, columnDefinition = "mediumtext")
    private String content;

    /** 创建时间 **/
    @Basic
    @CreatedDate
    @Column(name = "create_time", nullable = false)
    private Date createTime;

    /** 修改时间 **/
    @Basic
    @LastModifiedDate
    @Column(name = "update_time", nullable = false)
    private Date updateTime;
}
