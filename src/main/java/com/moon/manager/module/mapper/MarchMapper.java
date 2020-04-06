package com.moon.manager.module.mapper;

import com.moon.manager.module.po.March;

import java.util.List;


/**
* @Project: manager
* @Package com.moon.manager.module.mapper
* @Description: TODO
* @author : 龚志鹏
* @date Date : 2020年04月03日 21:52
* @version V1.0
*/
public interface MarchMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(March record);

    int insertSelective(March record);

    March selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(March record);

    int updateByPrimaryKey(March record);

    List<March> listAllJargon();
}