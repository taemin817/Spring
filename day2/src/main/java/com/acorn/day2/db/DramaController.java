package com.acorn.day2.db;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DramaController {

	@Autowired
	DramaDAO dao;
	
	@RequestMapping("/dbDrama")
	public String test1(Model model) {
		ArrayList<Drama> dList = new ArrayList<Drama>();
		dList = dao.select();
		
		model.addAttribute("list", dList);
		System.out.println(dList);
		return "dbDrama";
	}
}
