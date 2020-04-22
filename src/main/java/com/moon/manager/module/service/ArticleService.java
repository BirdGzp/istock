package com.moon.manager.module.service;

import com.moon.manager.module.po.Article;

import java.util.List;

/**
* @Project: manager
* @Package com.moon.manager.module.service
* @Description: TODO
* @author : 龚志鹏
* @date Date : 2020年03月30日 15:02
* @version V1.0
*/
public interface ArticleService
{

	int deleteByPrimaryKey(Integer id);

	int insert(Article record);

	int insertSelective(Article record);

	Article selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Article record);

	int updateByPrimaryKey(Article record);

	List<Article> listAll();

	List<Article> listByArticleId(Integer articleId);

	Article getArticleByArticleIdAndCatalogueId(Integer articleId, Integer catalogueId);
}
