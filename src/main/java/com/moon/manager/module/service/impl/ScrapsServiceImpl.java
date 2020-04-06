package com.moon.manager.module.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.moon.manager.module.po.Scraps;
import com.moon.manager.module.mapper.ScrapsMapper;
import com.moon.manager.module.service.ScrapsService;

import java.util.List;

/**
* @Project: manager
* @Package com.moon.manager.module.service.impl
* @Description: TODO
* @author : 龚志鹏
* @date Date : 2020年04月03日 22:12
* @version V1.0
*/
@Service
public class ScrapsServiceImpl implements ScrapsService{

    @Resource
    private ScrapsMapper scrapsMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return scrapsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Scraps record) {
        return scrapsMapper.insert(record);
    }

    @Override
    public int insertSelective(Scraps record) {
        return scrapsMapper.insertSelective(record);
    }

    @Override
    public Scraps selectByPrimaryKey(Integer id) {
        return scrapsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Scraps record) {
        return scrapsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Scraps record) {
        return scrapsMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Scraps> listAllScarps()
    {
        return scrapsMapper.listAllScarps();
    }


}
