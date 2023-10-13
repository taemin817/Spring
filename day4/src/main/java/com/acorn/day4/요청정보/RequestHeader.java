package com.acorn.day4.요청정보;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestHeader {
	@RequestMapping("/requestHeader")
	public void main(HttpServletRequest request) {
		// 요청하는 헤더 정보를 모두 출력하는 코드
		Enumeration<String> e = request.getHeaderNames();
		// 헤더 이름을 나열
		
		while (e.hasMoreElements()) {			// 모든 헤더를 순회, 아직 나열할 헤더가 남았는지 확인 후
			String name = e.nextElement();		// 다음 헤더 이름을 가져옴
			System.out.println(name + ":" + request.getHeader(name));
		}
	}
}