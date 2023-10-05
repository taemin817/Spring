package com.acorn.day1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BController {
	
	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	public String test1() {
		return "viewName";
	}
	@RequestMapping(value = "/test2", method = RequestMethod.GET)
	public void test2() {
		// void일 때는 매핑정보를 뷰이름으로 인식
	}
	@GetMapping("/test3")
	public void test3() {
		
	}
}
