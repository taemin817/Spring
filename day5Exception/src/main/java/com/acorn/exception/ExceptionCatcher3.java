package com.acorn.exception;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExceptionCatcher3 {
	
	@GetMapping("/db4")
	public void method1() throws SQLException {

			throw new SQLException();
		
	}
	
	@GetMapping("/db5")
	public void method2() throws SQLException {

			throw new SQLException();
		
	}
}
