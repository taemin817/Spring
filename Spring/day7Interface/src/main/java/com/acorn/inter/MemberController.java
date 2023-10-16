package com.acorn.inter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {

	@Autowired
	MemberServiceI service;

	@GetMapping("/memberT")
	public String register() {
		return "memberT";
	}

	@PostMapping("/memberT")
	public String register(Member member) {
		service.registerMember(member);
		return "home";
	}
	
	@GetMapping("/listup")
	public String selectAll(Model model) {
		List<Member> list = service.getMemberList();
		model.addAttribute("list", list);
		System.out.println(list);
		return "listUp";
	}

}
