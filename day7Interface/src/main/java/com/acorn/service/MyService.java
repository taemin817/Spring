package com.acorn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
	@Autowired
	MyRepo repo;
	@Autowired
	GoogleApi api;
	
	public void userRegister(String id, String name) {
		double[] result = api.위도경도구하기();
		repo.insertMember(id, name, String.valueOf(result[0]), String.valueOf(result[1]));
	}
}
