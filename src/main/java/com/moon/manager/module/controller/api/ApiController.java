package com.moon.manager.module.controller.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moon.manager.module.dto.JargonDto;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: gongzhipeng
 * @Date: 2020/3/19 10:22 上午
 * @Description:
 * @Project: istock
 * @Package com.moon.manager.module.controller.api
 */
@RestController
@Slf4j
public class ApiController
{
	@RequestMapping("/api/data")
	public List<JargonDto> getData()
	{
		List l = new ArrayList();
		JargonDto jargonDto = new JargonDto();
		jargonDto.setId(1);
		jargonDto.setType("JAVA");
		jargonDto.setExplain("asdasdada");
		jargonDto.setJargon("test");

		JargonDto jargonDto2 = new JargonDto();
		jargonDto2.setType("PYTHON");
		jargonDto2.setId(2);
		jargonDto2.setExplain("asdasdada");
		jargonDto2.setJargon("test");
		l.add(jargonDto);
		l.add(jargonDto2);
		return l;
	}
}
