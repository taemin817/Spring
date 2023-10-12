package com.acorn.cookie;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VisitController {

	@GetMapping("/count")
	public String cookie(HttpServletRequest request, HttpServletResponse response) {
		// 방문횟수 불러오기
		// 1. 쿠키 읽기
		// 2. 쿠키가 있다면 카운트 증가
		// 쿠키가 없다면 1로
		// 3. 쿠키 저장(사용자 pc-클라이언트-)
		int count = 0;
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				System.out.println(cookie.getName());
				System.out.println(cookie.getValue());

				if (cookie.getName().equals("count")) {
					String count_ = cookie.getValue();
					// "10"=>10
					count = Integer.parseInt(count_);
					break;
				}
			}
		}
		count++; // 10=>"10"
		Cookie cookie = new Cookie("count", String.valueOf(count));

		response.addCookie(cookie);
		return "visitHome";
	}
}
