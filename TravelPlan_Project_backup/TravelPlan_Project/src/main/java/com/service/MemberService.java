package com.service;

import java.util.HashMap;

import com.dto.MemberDTO;

public interface MemberService {
	// 자세히보기
	public int register(MemberDTO dto);
	// 로그인
	public MemberDTO login(HashMap<String, String> map);
	public MemberDTO idCheck(String userID);
	
	
}
