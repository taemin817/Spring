package com.acorn.day5test;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ApiController {
	
	@Autowired
	ApiExplorer ae;
	
//	@ResponseBody
//	@GetMapping(value="/testapi", produces = "application/json;charset=UTF-8")
//	public String a (Model model) throws IOException {
//		String result = ae.api();
//	 
//		return result;
//	}
	@GetMapping(value="/testapi")
	public String a2 (Model model) throws IOException {
		String result = ae.api();
		ArrayList<ItemDTO> list=ae.fromJSONtoItems(result);
		model.addAttribute("inform", list);
		return "testapi";
	}	
}
