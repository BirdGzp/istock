package com.moon.manager.config;

import com.moon.manager.config.intercepter.IpInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author : 龚志鹏
 * @version V1.0
 * @Project: manager
 * @Package com.moon.manager.config
 * @Description: TODO
 * @date Date : 2020年03月30日 16:43
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer
{
	@Autowired
	IpInterceptor ipInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry)
	{
		registry.addInterceptor(ipInterceptor).addPathPatterns("/**");
	}
}
