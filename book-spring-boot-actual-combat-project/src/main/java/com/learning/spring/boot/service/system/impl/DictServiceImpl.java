package com.learning.spring.boot.service.system.impl;

import com.learning.spring.boot.domain.entity.TDict;
import com.learning.spring.boot.domain.entity.TDictExample;
import com.learning.spring.boot.domain.response.Dict;
import com.learning.spring.boot.domain.response.QueryRequest;
import com.learning.spring.boot.mapper.TDictMapper;
import com.learning.spring.boot.service.system.DictService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Service("dictService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class DictServiceImpl implements DictService {

    @Autowired
    private TDictMapper dictMapper;

	@Override
	public List<TDict> findAllDicts(Dict dict, QueryRequest request) {
        TDictExample dictExample = new TDictExample();
        TDictExample.Criteria criteria = dictExample.createCriteria();

        if (StringUtils.isNotBlank(dict.getKeyy())) {
            criteria.andKeyyEqualTo(Long.valueOf(dict.getKeyy()));
        }
        if (StringUtils.isNotBlank(dict.getValuee())) {
            criteria.andValueeEqualTo(dict.getValuee());
        }
        if (StringUtils.isNotBlank(dict.getTableName())) {
            criteria.andTableNameEqualTo(dict.getTableName());
        }
        if (StringUtils.isNotBlank(dict.getFieldName())) {
            criteria.andFieldNameEqualTo(dict.getFieldName());
        }
        dictExample.setOrderByClause("dict_id");

        return dictMapper.selectByExample(dictExample);
	}

	@Override
	@Transactional
	public void addDict(Dict dict) {
        TDict tDict = new TDict();
        BeanUtils.copyProperties(dict,tDict);
        dictMapper.insertSelective(tDict);
	}

	@Override
	@Transactional
	public void deleteDicts(String dictIds) {
        String[] idList = dictIds.split(",");
        for (String id : idList){
            dictMapper.deleteByPrimaryKey(Long.valueOf(id));
        }
	}

	@Override
	@Transactional
	public void updateDict(Dict dict) {
        TDict tDict = new TDict();
        BeanUtils.copyProperties(dict,tDict);
        dictMapper.updateByPrimaryKeySelective(tDict);
	}

	@Override
	public TDict findById(Long dictId) {

	    return dictMapper.selectByPrimaryKey(dictId);
	}

}
