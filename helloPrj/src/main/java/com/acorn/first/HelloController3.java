package com.acorn.first;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController3 {

	@GetMapping("/model1")
	public String method1(Model model) {
		model.addAttribute("message", "화이팅!");
		return "model1";
	}
	
	@GetMapping("/model2")
	public String  method2(Model model)	{
		User user = new User("test", "1234");
		model.addAttribute("user", user);
		return "model2";
	}
}
