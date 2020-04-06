package com.moon.manager.module.service;

import com.moon.manager.module.po.March;

import java.util.List;

/**
* @Project: manager
* @Package com.moon.manager.module.service
* @Description: TODO
* @author : 龚志鹏
* @date Date : 2020年04月03日 21:52
* @version V1.0
*/
public interface MarchService{


    int deleteByPrimaryKey(Integer id);

    int insert(March record);

    int insertSelective(March record);

    March selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(March record);

    int updateByPrimaryKey(March record);

    List<March> listAllJargon();
}
