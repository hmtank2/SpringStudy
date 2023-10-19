package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.MemberDTO;
import com.dto.TravelDTO;
import com.dto.UserLikeDTO;
import com.service.MyPageService;

/*
likeList

writeList
  
 */


@Controller
public class MyPageController {
	
	@Autowired
	MyPageService service;
	
	// 회원정보수정
	@GetMapping("/MemberUpdate")
	public String memberUpdate() {
		
		return "memberUpdate";
	}
	
	// 일정보관함
	@GetMapping("/MyPlan")
	public String myPlan() {
		
		return "myPlan";
	}
	
	// 좋아요 목록
	@GetMapping("/LikeList")
	public String likeList(HttpSession session ,Model m) {
		MemberDTO dto = (MemberDTO)session.getAttribute("login");
		String userid = dto.getUserID();
		
		List<UserLikeDTO> ulDTOList = service.userLikeList(userid);
		//모델저장
		m.addAttribute("ulDTOList",ulDTOList);
		
		return "likeList";
	}
	
	// 내가 쓴 글 목록 //여행계획 (내보관함) 목록임
	@GetMapping("/WriteList")
	public String writeList(HttpSession session ,Model m) {
		MemberDTO dto = (MemberDTO)session.getAttribute("login");
		String userid = dto.getUserID();
		
		List<TravelDTO> wDTOList = service.writeList(userid);
		//모델저장
		m.addAttribute("wDTOList",wDTOList);
		
		return "writeList";
	}
	
	/*
	 * // 세션을 생성하기 전에 기존의 세션 파기
        httpServletRequest.getSession().invalidate();
        HttpSession session = httpServletRequest.getSession(true);  // Session이 없으면 생성
        // 세션에 userId를 넣어줌
        session.setAttribute("userId", user.getId());
        session.setMaxInactiveInterval(1800); // Session이 30분동안 유지
	 */
}
