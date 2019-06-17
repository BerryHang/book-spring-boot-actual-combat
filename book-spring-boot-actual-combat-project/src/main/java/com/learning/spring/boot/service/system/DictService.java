package com.learning.spring.boot.service.system;

import com.learning.spring.boot.domain.entity.TDict;
import com.learning.spring.boot.domain.response.Dict;
import com.learning.spring.boot.domain.response.QueryRequest;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

@CacheConfig(cacheNames = "DictService")
public interface DictService {

    @Cacheable(key = "#p0.toString() + (#p1 != null ? #p1.toString() : '')")
    List<TDict> findAllDicts(Dict dict, QueryRequest request);

    @Cacheable(key = "#p0")
    TDict findById(Long dictId);

    @CacheEvict(allEntries = true)
    void addDict(Dict dict);

    @CacheEvict(key = "#p0", allEntries = true)
    void deleteDicts(String dictIds);

    @CacheEvict(key = "#p0", allEntries = true)
    void updateDict(Dict dicdt);
}
