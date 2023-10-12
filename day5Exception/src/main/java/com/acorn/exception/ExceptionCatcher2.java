package com.acorn.exception;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExceptionCatcher2 {

	@ExceptionHandler(Exception.class)
	public String catcher1(Model model, SQLException ex) {
		model.addAttribute("ex",ex);
		return "err2";
	}
	
	@GetMapping("/db2")
	public void method1() throws SQLException {

			throw new SQLException();
		
	}
	
	@GetMapping("/db3")
	public void method2() throws SQLException {

			throw new SQLException();
		
	}
}
