package com.Intercaptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component("xx")//이제 오토스캔 가능해짐.
public class MyhandlerInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//기능 : request 이용해서 특별한 작업 수행. == 로그인 여부 확인
		System.out.println("HandlerInterceptorAdapter.prehandle");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		//기능 : reponse 이용해서 특별한 작업 수행. == ModelAndView 이용해서 view 정보 변경 등 가능
		System.out.println("HandlerInterceptorAdapter.postHandle");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("HandlerInterceptorAdapter.afterCompletion");
	}
	

}
