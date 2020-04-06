package com.moon.manager.spider.gushiwen;

import com.moon.manager.spider.gushiwen.papline.ShowContentPipeline;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.model.ConsolePageModelPipeline;
import us.codecraft.webmagic.model.OOSpider;
import us.codecraft.webmagic.model.annotation.ExtractBy;
import us.codecraft.webmagic.model.annotation.HelpUrl;
import us.codecraft.webmagic.model.annotation.TargetUrl;

/**
 * @author : 龚志鹏
 * @version V1.0
 * @Project: manager
 * @Package com.moon.manager.spider.gushiwen
 * @Description: TODO
 * @date Date : 2020年03月30日 19:53
 */
@HelpUrl("https://so.gushiwen.cn/guwen/book_\\w+")
@TargetUrl("https://so.gushiwen.cn/guwen/bookv_\\w+.aspx")
public class GushiwenContentSpider
{

	@ExtractBy("//div[@class='sons']//b")
	private String title;
	@ExtractBy("//div[@class='sons']//div[@class='contson']")
	private String content;


	public static void main(String[] args)
	{
		OOSpider.create(Site.me().setSleepTime(100), new ShowContentPipeline(), GushiwenContentSpider.class)
				.addUrl("https://so.gushiwen.cn/guwen/book_46653FD803893E4F75696240258265D2.aspx").run();
	}
}
