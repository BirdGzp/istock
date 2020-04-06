package com.moon.manager.module.service;

import com.moon.manager.module.po.Scraps;

import java.util.List;

/**
* @Project: manager
* @Package com.moon.manager.module.service
* @Description: TODO
* @author : 龚志鹏
* @date Date : 2020年04月03日 22:12
* @version V1.0
*/
public interface ScrapsService{


    int deleteByPrimaryKey(Integer id);

    int insert(Scraps record);

    int insertSelective(Scraps record);

    Scraps selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Scraps record);

    int updateByPrimaryKey(Scraps record);

    List<Scraps> listAllScarps();
}
