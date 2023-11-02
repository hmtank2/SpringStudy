package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.TravelListDAO;
import com.dto.TravelListDTO;

	@Service
	public class TravelListServiceImpl implements TravelListService {

	@Autowired
	TravelListDAO dao;
	
	//일정보관함
	@Override
	public List<TravelListDTO> travel(String userID) {
		List<TravelListDTO> list = dao.travel(userID);
		return list;
	}
	
	// 일정 상세보기
	@Override
	public TravelListDTO travelRetrieve(int travelID) {
		TravelListDTO dto = dao.travelRetrieve(travelID);
		return dto;
	}

	// 일정 삭제하기
	@Override
	public int travelDel(int travelID) {
		int n = dao.travelDel(travelID);
		return n;
	}

}