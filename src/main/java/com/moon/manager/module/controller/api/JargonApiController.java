package com.moon.manager.module.controller.api;

import com.moon.manager.module.po.Jargon;
import com.moon.manager.module.service.JargonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : 龚志鹏
 * @version V1.0
 * @Project: manager
 * @Package com.moon.manager.module.controller.api
 * @Description: TODO
 * @date Date : 2020年03月31日 23:17
 */
@RestController
@Slf4j
public class JargonApiController
{
	@Autowired
	private JargonService jargonService;

	@ResponseBody
	@RequestMapping("/api/jargon/all")
	public List<Jargon> listAllJargon()
	{
		return jargonService.listAllJargon();
	}

	@ResponseBody
	@PostMapping(value = "/api/jargon/insert", produces = "application/json;charset=UTF-8")
	public void addJargon(@RequestBody Jargon jargon)
	{
		log.info("当前行话内容为:{}", jargon);
		jargonService.insert(jargon);
	}

	@ResponseBody
	@PostMapping(value = "/api/jargon/delete/{id}", produces = "application/json;charset=UTF-8")
	public void deleteJargon(@PathVariable Integer id)
	{
		log.info("删除 ：{}", id);
		jargonService.deleteByPrimaryKey(id);
	}

	@ResponseBody
	@PostMapping(value = "/api/jargon/update", produces = "application/json;charset=UTF-8")
	public void updateJargon(@RequestBody Jargon jargon)
	{
		log.info(" jargon 信息为:{}", jargon);
		//		jargonService.updateByPrimaryKeySelective(jargon);
	}
}
