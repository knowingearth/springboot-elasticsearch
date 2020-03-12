package com.my.elasticsearch.controller;

import com.my.elasticsearch.entity.QueryParams;
import com.my.elasticsearch.entity.es.EsBlog;
import com.my.elasticsearch.entity.mysql.MysqlBlog;
import com.my.elasticsearch.repository.es.EsBlogRepository;
import com.my.elasticsearch.repository.mysql.MysqlBlogRepository;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class DataController {
    @Autowired
    private MysqlBlogRepository mysqlBlogRepository;

    @Autowired
    private EsBlogRepository esBlogRepository;

    @GetMapping("/blogs")
    public Object blog(){
        List<MysqlBlog> mysqlBlogs = mysqlBlogRepository.queryAll();
        return mysqlBlogs;
    }

    @PostMapping("/search")
    public Object search(@RequestBody QueryParams param){
        HashMap<String, Object> hashMap = new HashMap<>();
        StopWatch watch = new StopWatch();
        watch.start();
        if ("mysql".equalsIgnoreCase(param.getType())) {
            List<MysqlBlog> mysqlBlogs = mysqlBlogRepository.queryBlogs(param.getKeyword());
            System.out.println("总数："+mysqlBlogs.size());
            hashMap.put("list", mysqlBlogs);
        }else if("es".equalsIgnoreCase(param.getType())){
            BoolQueryBuilder builder = QueryBuilders.boolQuery();
            builder.should(QueryBuilders.matchPhraseQuery("title", param.getKeyword()));
            builder.should(QueryBuilders.matchPhraseQuery("content", param.getKeyword()));
            String str = builder.toString();
            System.out.println(str);
            Page<EsBlog> search =(Page<EsBlog>) esBlogRepository.search(builder);
            List<EsBlog> content = search.getContent();
            System.out.println("总数："+content.size());
            hashMap.put("list", content);
        }else{
            return "type exception";
        }
        watch.stop();

        hashMap.put("duration", watch.getTotalTimeMillis());
        return hashMap;
    }
}
