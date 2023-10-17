package com.acorn.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class SessionInterceptor extends HandlerInterceptorAdapter{

	@Override			// 진행시켜 : true, 중지 : false
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		// 세션확인하는 코드
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("loginID");
															// ID정보를 가져오지않고 일단 문자열을 설정하여 로그인 되어있는 상태로 만듦
		
		if(id==null) {	// id가 입력되지 않았다면
			response.sendRedirect(request.getContextPath()+"/login");	// login화면으로 보내고 끝
			return false;
		}
		return true;
	}
}
