package com.moon.manager.module.mapper;

import com.moon.manager.module.po.Jargon;

import java.util.List;


/**
* @Project: manager
* @Package com.moon.manager.module.mapper
* @Description: TODO
* @author : 龚志鹏
* @date Date : 2020年03月31日 19:52
* @version V1.0
*/
public interface JargonMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Jargon record);

    int insertSelective(Jargon record);

    Jargon selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Jargon record);

    int updateByPrimaryKey(Jargon record);

    List<Jargon> listAllJargon();
}