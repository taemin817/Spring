package com.acorn.day1test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AController {
	@GetMapping("/*")
	public void test1() {
		
	}
}
