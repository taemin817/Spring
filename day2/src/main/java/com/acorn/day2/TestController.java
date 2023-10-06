package com.acorn.day2;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// 메소드별로 매핑
@Controller
public class TestController {

	@Autowired
	TestService service;
	
	@RequestMapping("/gugudan")
	public String test1(@RequestParam(required=false, defaultValue="2")int dan, Model model) {
		ArrayList<String> danList = service.getDan(dan);
		model.addAttribute("list", danList);
		System.out.println(dan);
		return "test";
	}
	
	@RequestMapping("/movielist")
	public String test2(Model model) {
		ArrayList<String> movieList	= service.getMovieList();
		model.addAttribute("list", movieList);
		System.out.println(movieList);
		return "movie";
	}
	
	@RequestMapping("/resList")
	public String test3(Model model) {
		ArrayList<ResInfo> resInfo = service.getResInfo();
		model.addAttribute("list", resInfo);
		System.out.println(resInfo);
		return "restaurant";
	}
}
