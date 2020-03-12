package com.my.elasticsearch.repository.es;

import com.my.elasticsearch.entity.es.EsBlog;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface EsBlogRepository  extends ElasticsearchRepository<EsBlog, Integer> {
}
