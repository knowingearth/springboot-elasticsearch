package com.my.elasticsearch.es;


import com.alibaba.fastjson.JSON;
import com.my.elasticsearch.SpringbootElasticsearchApplicationTests;
import com.my.elasticsearch.controller.DataController;
import com.my.elasticsearch.entity.QueryParams;
import com.my.elasticsearch.entity.es.EsBlog;
import com.my.elasticsearch.repository.es.EsBlogRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Iterator;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringbootElasticsearchApplicationTests.class})
public class TestEs {
    @Autowired
    private EsBlogRepository esBlogRepository;

    @Autowired
    private DataController dataController;


    @Test
    public void testEs(){
        Iterable<EsBlog> all = esBlogRepository.findAll();
        Iterator<EsBlog> iterator = all.iterator();
        while(iterator.hasNext()){
            System.out.println(JSON.toJSONString(iterator.next()));
        }
    }

    @Test
    public void testMySqlSearch(){
        QueryParams q = new QueryParams("mysql", "Spring");
        Object search = dataController.search(q);
        System.out.println(JSON.toJSONString(search));

    }
    @Test
    public void testEsSearch(){
        QueryParams q = new QueryParams("es", "Spring");
        Object search = dataController.search(q);
        System.out.println(JSON.toJSONString(search));

    }
}
