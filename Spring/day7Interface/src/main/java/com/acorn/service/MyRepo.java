package com.acorn.service;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepo {
	public void insertMember(String id, String name, String latitude, String longitude) {
		// 마이바티스 관련 코드 생략
		// jdbc 관련 코드 생략
		System.out.println("회원테이블에 등록");
		System.out.println(id + ", " + name + ", " + latitude + ", " + longitude);
	}

}
