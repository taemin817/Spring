package com.acorn.prac;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberRepo {
	@Autowired
	private SqlSession session;
															// memberMapper의 namespace랑 동일하게
    private static String namespace = "com.acorn.MemberMapper.";	// 별칭이라 임의작성이지만 마지막 . 은 필수
    
    public List<Member> selectAll(){
    	return session.selectList(namespace+"selectAll");
    }
    
    public Member selectOne(String id) {
    	return session.selectOne(namespace+"selectOne", id);
    }
}
