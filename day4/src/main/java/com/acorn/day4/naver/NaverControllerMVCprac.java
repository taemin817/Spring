package com.acorn.day4.naver;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NaverControllerMVCprac {

	@Autowired
	ApiExamSearchBlog api;
	
	@Autowired
	ApiExamSearchBlog2 api2;
	
	@ResponseBody
	@GetMapping(value="/naver", produces = "application/json;charset=UTF-8")
	public String naverAPI() {
		
		String result = api.getNaverAPI();
		return result;
	}
	
	@ResponseBody
	@GetMapping( value="/naverList"  )
	public ArrayList<ItemDTO> naverAPI2(){
		String result  =api2.getNaverAPI();
		ArrayList<ItemDTO> list  =api2.fromJSONtoItems(result);
		return list;
	}
	

	@GetMapping("/nList")
	public String a (Model model) {
		String result = api2.getNaverAPI();
		ArrayList<ItemDTO> list = api2.fromJSONtoItems(result);
		model.addAttribute("nListPrac",list);
		return "nListPrac";
	}

}
