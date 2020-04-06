package com.moon.manager.spider.gushiwen.papline;

import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.PageModelPipeline;
/**
 * @author : 龚志鹏
 * @version V1.0
 * @Project: manager
 * @Package com.moon.manager.spider.gushiwen.papline
 * @Description: TODO
 * @date Date : 2020年03月30日 20:02
 */
public class ShowContentPipeline implements PageModelPipeline {


    @Override
	public void process(Object resultItems, Task task)
	{
		System.out.println(resultItems);
		System.out.println(task);
	}
}
