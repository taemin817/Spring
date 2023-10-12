package com.acorn.exception;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExceptionCatcher {

	@GetMapping("/db")
	public String method1() {
		String view = "view1";
		try {
			throw new SQLException();
		} catch (SQLException ex) {
			// 오류발생했을 때 error 페이지로
			view= "err";
		}
		return view;
	}
}
