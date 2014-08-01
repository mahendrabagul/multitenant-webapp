package com.howtodoinjava.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class DemoInterceptor implements HandlerInterceptor {
	private Tenant tenant = Tenant.getInstance();

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		String url = request.getRequestURL().toString();
		if (url.contains("java")) {
			tenant.setTenantName("java");
		} else if (url.contains("qa")) {
			tenant.setTenantName("qa");
		} else if (url.contains("lamp")) {
			tenant.setTenantName("lamp");
		} else if (url.contains("ms")) {
			tenant.setTenantName("ms");
		} else if (url.contains("infra")) {
			tenant.setTenantName("infra");
		}
		System.out.println("<><><><><><><><><><><><><><><><><><><><><><>");
		System.out.println("Tenant obtained: " + tenant.getTenantName());
		System.out.println("<><><><><><><><><><><><><><><><><><><><><><>");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception exception)
			throws Exception {
	}
}