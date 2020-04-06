package com.moon.manager.module.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.moon.manager.module.po.Article;
import com.moon.manager.module.mapper.ArticleMapper;
import com.moon.manager.module.service.ArticleService;

import java.util.List;

/**
* @Project: manager
* @Package com.moon.manager.module.service.impl
* @Description: TODO
* @author : 龚志鹏
* @date Date : 2020年03月30日 15:02
* @version V1.0
*/
@Service
public class ArticleServiceImpl implements ArticleService
{

	@Resource
	private ArticleMapper articleMapper;

	@Override
	public int deleteByPrimaryKey(Integer id)
	{
		return articleMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Article record)
	{
		return articleMapper.insert(record);
	}

	@Override
	public int insertSelective(Article record)
	{
		return articleMapper.insertSelective(record);
	}

	@Override
	public Article selectByPrimaryKey(Integer id)
	{
		return articleMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Article record)
	{
		return articleMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Article record)
	{
		return articleMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Article> listAll()
	{
		return articleMapper.listAll();
	}

	@Override
	public List<Article> listByArticleId(Integer articleId)
	{
		return articleMapper.listByArticleId(articleId);
	}
}
