package com.moon.manager.module.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.moon.manager.module.po.March;
import com.moon.manager.module.mapper.MarchMapper;
import com.moon.manager.module.service.MarchService;

import java.util.List;

/**
* @Project: manager
* @Package com.moon.manager.module.service.impl
* @Description: TODO
* @author : 龚志鹏
* @date Date : 2020年04月03日 21:52
* @version V1.0
*/
@Service
public class MarchServiceImpl implements MarchService{

    @Resource
    private MarchMapper marchMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return marchMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(March record) {
        return marchMapper.insert(record);
    }

    @Override
    public int insertSelective(March record) {
        return marchMapper.insertSelective(record);
    }

    @Override
    public March selectByPrimaryKey(Integer id) {
        return marchMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(March record) {
        return marchMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(March record) {
        return marchMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<March> listAllJargon()
    {
        return marchMapper.listAllJargon();
    }



}
