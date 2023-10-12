package com.acorn.day5test;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ApiController {
	
	@Autowired
	ApiExplorer ae;
	
	@ResponseBody
	@GetMapping("/testapi")
	public String a (Model model) throws IOException {
		String result = ae.api();
		ArrayList<ItemDTO> list = ae.fromJSONtoItems(result);
		model.addAttribute("testList",list);
		return "testList";
	}
	
}
