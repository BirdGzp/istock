package com.moon.manager.module.mapper;

import com.moon.manager.module.po.Article;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
* @Project: manager
* @Package com.moon.manager.module.mapper
* @Description: TODO
* @author : 龚志鹏
* @date Date : 2020年03月30日 15:02
* @version V1.0
*/

public interface ArticleMapper
{
	int deleteByPrimaryKey(Integer id);

	int insert(Article record);

	int insertSelective(Article record);

	Article selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Article record);

	int updateByPrimaryKey(Article record);

	List<Article> listAll();

	List<Article> listByArticleId(Integer articleId);

	Article getArticleByArticleIdAndCatalogueId(@Param("articleId") Integer articleId, @Param("catalogueId")Integer catalogueId);
}