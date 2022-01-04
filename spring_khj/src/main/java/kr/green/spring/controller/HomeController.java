package kr.green.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.green.spring.service.MemberService;
import kr.green.spring.vo.MemberVO;
// @Controller가 있어야 URL을 분석하여 처리
@Controller
public class HomeController {
	
	@Autowired
	MemberService memberService;
		
	// URL을 확인하는 곳, 필수
	// value는 localhost:8080/패키지명을 제외한 부분
	// method는 전달 방식, 
	// GET(사용자에게 정보가 보여져도 되는 부분), 
	// POST(사용자에게 보이면 안되는 정보, 너무 길어서 다 보이면 지저분해지는 정보),
	// 생략하면 둘다
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(ModelAndView mv) {
		mv.setViewName("/main/home");
		// 화면으로 데이터를 보낼 때 addObject를 사용
		// addObject("화면에서 사용할 이름", 데이터);
		mv.addObject("serverTime", "데이터" );
		
		return mv;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginGet(ModelAndView mv) {
		System.out.println("/login:get :");
		mv.setViewName("/member/login");
		return mv;
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView loginPost(ModelAndView mv, MemberVO member) {
		System.out.println("/login:post : " + member);
		memberService.login(member);
		mv.setViewName("/member/login");
		return mv;
	}
}
