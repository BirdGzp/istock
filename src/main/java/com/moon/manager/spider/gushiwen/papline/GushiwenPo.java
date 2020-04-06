package com.moon.manager.spider.gushiwen.papline;

import lombok.Data;
import us.codecraft.webmagic.model.annotation.ExtractBy;

/**
 * @author : 龚志鹏
 * @version V1.0
 * @Project: manager
 * @Package com.moon.manager.spider.gushiwen.papline
 * @Description: TODO
 * @date Date : 2020年03月30日 20:32
 */
@Data
public class GushiwenPo
{
	@ExtractBy("//div[@class='sons']//b")
	private String title;
	@ExtractBy("//div[@class='sons']//div[@class='contson']")
	private String content;
}
