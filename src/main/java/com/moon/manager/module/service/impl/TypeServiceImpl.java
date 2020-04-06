package com.moon.manager.module.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.moon.manager.module.mapper.TypeMapper;
import com.moon.manager.module.po.Type;
import com.moon.manager.module.service.TypeService;

import java.util.List;

/**
* @Project: manager
* @Package com.moon.manager.module.service.impl
* @Description: TODO
* @author : 龚志鹏
* @date Date : 2020年03月31日 19:51
* @version V1.0
*/
@Service
@Slf4j
public class TypeServiceImpl implements TypeService{

    @Resource
    private TypeMapper typeMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return typeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(String type) {
        Type typeRecord = new Type();
        typeRecord.setType(type);
        log.info("插入 type 记录:{}", type);
        return typeMapper.insert(typeRecord);
    }

    @Override
    public int insertSelective(Type record) {
        return typeMapper.insertSelective(record);
    }

    @Override
    public Type selectByPrimaryKey(Integer id) {
        return typeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Type record) {
        return typeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Type record) {
        return typeMapper.updateByPrimaryKey(record);
    }

    @Override
    public Type selectByType(String type)
    {
        return typeMapper.selectByType(type);
    }

    @Override
    public List<Type> listAll()
    {
        return typeMapper.listAll();
    }


}
