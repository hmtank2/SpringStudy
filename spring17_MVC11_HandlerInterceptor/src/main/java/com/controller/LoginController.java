package com.controller;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import com.dto.LoginDTO;

@Controller
public class LoginController {
	
	//http://localhost:8090/app/xxx
	@GetMapping("/loginForm")
	public String home() {
		System.out.println("TestController.home 메서드");
		
		return "loginForm";// /WEB-INF/views/loginForm.jsp로 포워드 요청
	}
	

	
	@GetMapping("/login1")
	public String login1(LoginDTO dto, HttpSession session) {//request 주입 받음.
		//사입데 얻어오기
		//저장된 데이터를 이용해서 DB 연동해서 검증. 한걸로 우선 가정
		//세션에 저장
		System.out.println(dto);
		session.setAttribute("login", dto);
		return "loginForm";// /WEB-INF/views/login.jsp 로그인 이후 화면
	}
	
	
	@GetMapping("/loginCheck/loginOut")
	public String logout(HttpSession session) {
		//로그인 체크 여부 확인
		//
		LoginDTO dto = (LoginDTO)session.getAttribute("login");
		if(dto == null) {
			return "redirect:loginForm";
		}else {
			session.invalidate();
			return "main";// /WEB-INF/views/loginForm.jsp로 포워드 요청
		}
	}
	
	
	@GetMapping("/loginCheck/mypage")
		public String myPage() {
			
			return "main";
		}
		
	
	
	
}
