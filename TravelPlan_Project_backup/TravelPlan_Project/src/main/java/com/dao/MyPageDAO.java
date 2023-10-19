package com.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.dto.TravelDTO;
import com.dto.UserLikeDTO;

public class MyPageDAO {
// UserLike, TravelDTO 사용 함
// user like list 테이블에서 select => planDTO를 사용함 
	@Autowired
	SqlSessionTemplate session;
	
	// 내가 찜 한 글 목록
	public List<UserLikeDTO> userLikeList(String userid) {
		return session.selectList("MyPageMapper.userLikeList", userid);
	}

	// 여행계획 (내보관함) 목록임
	public List<TravelDTO> writeList(String userid) {
		return session.selectList("MyPageMapper.writeList", userid);
	}
}
