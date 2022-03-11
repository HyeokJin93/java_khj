package kr.green.futsal.interceptor;

import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import kr.green.futsal.service.MemberService;
import kr.green.futsal.vo.MemberVO;



public class LoginInterceptor extends HandlerInterceptorAdapter{

	@Autowired
	MemberService memberService;
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, 
	    Object handler, ModelAndView modelAndView)
	    throws Exception {
			ModelMap modelMap = modelAndView.getModelMap();
			MemberVO user = (MemberVO)modelMap.get("user");
			
	    if(user != null) {
	        HttpSession session = request.getSession();
	        if(user.getMe_auto_login() != null) {
	        	Cookie cookie = new Cookie("loginCookie", session.getId());
	        	cookie.setPath("/");
	        	int day = 7;
	        	int session_limit_second = 60 * 60 * 24 * day;
	        	cookie.setMaxAge(session_limit_second);
	        	response.addCookie(cookie);
	        	//DB 회원 정보에 쿠키에 저장된 session_id와 session 유지 시간을 업데이트
	        	//1000ms + 1s => 1000ms + 1000ms => 2000ms
	        	Date session_limit = new Date(System.currentTimeMillis()
	        			+ 1000 * session_limit_second);
	        	user.setMe_session_id(session.getId());
	        	user.setMe_session_limit(session_limit);
	        	memberService.updateAutoLogin(user);
	        }
	        session.setAttribute("user", user);
	    }
	}
}
