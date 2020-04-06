package com.moon.manager.module.controller.api;

import com.moon.manager.module.po.Type;
import com.moon.manager.module.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : 龚志鹏
 * @version V1.0
 * @Project: manager
 * @Package com.moon.manager.module.controller.api
 * @Description: TODO
 * @date Date : 2020年04月04日 23:58
 */
@RestController
public class TypeApiController
{
	@Autowired
	private TypeService typeService;

	@RequestMapping("/api/type/all")
	public List<Type> listAllType()
	{
		return typeService.listAll();
	}
}
