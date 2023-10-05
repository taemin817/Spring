package com.acorn.day1.di;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class pController3 {

	// 메소드 단위로 매핑
	@Autowired
	TestService ts;
	
	@GetMapping("/list")
	public String test1(Model model) {
		// Model
		ArrayList<String>list = ts.getList();
		model.addAttribute("list", list);
		return "memberList";
	}
}
