package com.moon.manager.module.service;

import com.moon.manager.module.po.Type;

import java.util.List;

/**
* @Project: manager
* @Package com.moon.manager.module.service
* @Description: TODO
* @author : 龚志鹏
* @date Date : 2020年03月31日 19:51
* @version V1.0
*/
public interface TypeService{


    int deleteByPrimaryKey(Integer id);

    int insert(String type);

    int insertSelective(Type record);

    Type selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Type record);

    int updateByPrimaryKey(Type record);

    Type selectByType(String type);

    List<Type> listAll();
}
