package com.moon.manager.module.controller.api;

import com.moon.manager.module.po.Article;
import com.moon.manager.module.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : 龚志鹏
 * @version V1.0
 * @Project: manager
 * @Package com.moon.manager.module.controller.api
 * @Description: TODO
 * @date Date : 2020年03月30日 15:35
 */
@RestController
public class ArticleApiController
{
	@Autowired
	private ArticleService articleService;

	@PostMapping("/api/article/all")
	public List<Article> listArticleService()
	{
		return articleService.listAll();
	}

	@PostMapping("/api/article/{articleId}")
	public List<Article> listArticleService(@PathVariable("articleId") Integer articleId)
	{
		return articleService.listByArticleId(articleId);
	}
}
