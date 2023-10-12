package com.acorn.first;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("/hi")
	public String hi() {
		return "hi";		// WEB-INF/views/hi.jsp��� view�� �����ϰڴ�
	}
	
	@GetMapping("/hi2")
	public String hi2(String id, String pw) {	//		/hi?id=��¼��&pw=��¼��
		System.out.println(id + ", " + pw);
		return "hi2";
	}

	@GetMapping("/hi3")
	public String hi3 (User user) {		//		/hi?id=��¼��&pw=��¼�� �� ������ user ��ü �����ؼ� ���ε�
		System.out.println(user);
		return "hi3";
	}
	
	@GetMapping("/hi0")
	public void hello(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.getRequestDispatcher("WEB-INF/views/hi0.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
