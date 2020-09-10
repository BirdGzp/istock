package com.moon.manager.config.intercepter;

import com.moon.manager.util.IpUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author : 龚志鹏
 * @version V1.0
 * @Project: manager
 * @Package com.moon.manager.config.intercepter
 * @Description: TODO
 * @date Date : 2020年03月30日 16:42
 */
@Slf4j
@Service()
public class IpInterceptor extends HandlerInterceptorAdapter
{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
	{
		log.info("IP: {} , 访问 URL {}",  IpUtil.getRemoteAddr(request), request.getServletPath());
		log.info("请求路径为 [{}], [{}], [{}]", request.getRequestURI(), request.getRequestURL(), request.getMethod());
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable ModelAndView modelAndView) throws Exception
	{

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable Exception ex) throws Exception
	{
		log.info("TestInterceptor afterCompletion....");
	}
}
