package com.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.ServletContextAware;

@Controller
public class TestController implements ServletContextAware {
	//3개의 스코프에 모델 저정
	// request scope : Model 이용 꼭 모델이 아니어도 상관 없다.
	//application scope: ServletContext
	
	ServletContext application;
	
	@RequestMapping("/xxx")
	public String xxx(Model m, HttpSession session) {
		//request scope 에 저장
		m.addAttribute("request", "request");//request scope 에 저장.
		
		//session scope에 저장
		session.setAttribute("session", "session");//session scope 에 저장.
		
		application.setAttribute("application", "application");
		return "hello";
	}

	@Override
	public void setServletContext(ServletContext servletContext) {
		this.application = servletContext;//이렇게 하면 자동으로 셋메서드로 주입
	}
	
	
	
}
