package com.moon.manager.spider.gushiwen;

import lombok.Data;
import org.apache.http.client.methods.HttpPost;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.model.ConsolePageModelPipeline;
import us.codecraft.webmagic.model.OOSpider;
import us.codecraft.webmagic.model.annotation.ExtractBy;
import us.codecraft.webmagic.model.annotation.HelpUrl;
import us.codecraft.webmagic.model.annotation.TargetUrl;
import us.codecraft.webmagic.pipeline.ConsolePipeline;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.List;

/**
 * @author : 龚志鹏
 * @version V1.0
 * @Project: manager
 * @Package com.moon.manager.spider.gushiwen
 * @Description: 古诗文网站爬虫启动器
 * @date Date : 2020年03月30日 17:24
 */
@HelpUrl("https://so.gushiwen.cn/guwen/default.aspx?\\w+")
@TargetUrl("https://so.gushiwen.cn/guwen/book_\\w+.aspx")
@Data
public class GushiwenSpiderBoot
{
	@ExtractBy("//title")
	private String title;

	@ExtractBy(value = "b")
	private String content;

	@ExtractBy(value = "//div[@class='BlogTags']/a/text()")
	private List<String> tags;


	public static void main(String[] args) {
		OOSpider.create(
				Site.me(),
				new ConsolePageModelPipeline(), GushiwenSpiderBoot.class).addUrl("https://so.gushiwen.cn/guwen/").run();
	}
}
