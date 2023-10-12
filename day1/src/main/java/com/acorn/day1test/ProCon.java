package com.acorn.day1test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProCon{

	@Autowired
	Pro pro;
	
	@ GetMapping("/pView2")
	public void test1() {
		int result = pro.addP(2, 2);
		System.out.println(result);
	}
	
	public Pro getP() {
		return pro;
	}
}
