package com.acorn.cookie;

import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

	@GetMapping("/login") // =>localhost:8090/cookie/login/login
	public String loginForm() {
		return "loginForm";
	}

	@PostMapping("/login") // =>localhost:8090/cookie/login/login
	public String login(String id, String pwd, boolean rememberId, HttpServletResponse response,
			HttpServletRequest request) {

		// 로그인 성공했을 때
		if (loginCheck(id, pwd)) {
			// 세션에 저장
			HttpSession session = request.getSession();
			session.setAttribute("sessionId", id);
			// 아이디 기억하기
			if (rememberId) {
				// 저장
				Cookie cookie = new Cookie("id", id);
				response.addCookie(cookie);
			} else {
				// 삭제
				Cookie cookie = new Cookie("id", id);
				cookie.setMaxAge(0);
				response.addCookie(cookie);
			}
			return "main";
		} else {
			// 로그인 실패했을 때
			// 메세지 심기
			// 한글이 있으면 로그인 실패시 아무화면 안나옴....String msg = "id, pw : 불일치";
			String msg = URLEncoder.encode("id pw 확인좀요");
			return "redirect:/login/login?msg="+msg;
		}
	}
	
	@GetMapping("/logOut")
	public String logOut(HttpServletRequest	resquest) {
		HttpSession session = resquest.getSession();
		session.invalidate();		// 현재 세션 무효화
		return "redirect:/login/login";		// 매핑경로
	}
	
	public boolean loginCheck(String id, String pwd) {
		return id.equals("test") && pwd.equals("test");
	}
}
