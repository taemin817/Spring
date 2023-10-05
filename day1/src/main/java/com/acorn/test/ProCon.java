package com.acorn.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProCon{

	@Autowired
	Pro p;

	@Autowired
	public void setP(Pro p) {
		this.p = p;
	}
	
	@GetMapping("/p")
	public String test1()	{
		int result = p.addP(2, 3);
		System.out.println(result);
		return "pView2";
	}
}
