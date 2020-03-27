package com.moon.manager.module.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: gongzhipeng
 * @Date: 2020/3/19 10:21 上午
 * @Description:
 * @Project: istock
 * @Package com.moon.manager.module.controller
 */
@Controller
public class AjaxContoller
{
	@RequestMapping("/test")
	public String page()
	{
		return "manager/dialog";
	}
}
