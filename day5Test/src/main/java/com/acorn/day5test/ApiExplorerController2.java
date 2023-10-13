package com.acorn.day5test;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApiExplorerController2 {

	@Autowired
	ApiExplorer2 api;

	@ResponseBody
	@GetMapping(value = "/api", produces = "application/json;charset=UTF-8")
	public String openApi() throws IOException {
		String result = api.getApiTest();
		return result;
	}

	@GetMapping(value = "/api2")
	public String openApi2(Model model) throws IOException {
		String result = api.getApiTest();
		ArrayList<ItemDTO> list = api.fromJsonToItems(result);
		model.addAttribute("list", list);
		return "openApi";
	}
}