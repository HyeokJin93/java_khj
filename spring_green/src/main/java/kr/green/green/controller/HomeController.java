package kr.green.green.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import kr.green.green.service.MemberService;
import kr.green.green.vo.MemberVO;

@Controller
public class HomeController {
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(ModelAndView mv) {
		mv.setViewName("/main/home");
		return mv;
	}
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public ModelAndView signupGet(ModelAndView mv, MemberVO user) {
		System.out.println("/signup:get : ");
		mv.setViewName("/member/signup");
		return mv;
	}
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public ModelAndView signupPost(ModelAndView mv, MemberVO user) {
		System.out.println(user);
		boolean isSignup = memberService.signup(user);
		if(isSignup) {
			mv.setViewName("redirect:/");
		}else {
			mv.setViewName("redirect:/signup");
		}
		return mv;
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginGet(ModelAndView mv) {
		mv.setViewName("/member/login");
		return mv;
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView loginPost(ModelAndView mv, MemberVO user) {
		MemberVO loginUser = memberService.login(user);
		mv.addObject("user",loginUser);
		if(loginUser == null)
			mv.setViewName("redirect:/login");
		else
			mv.setViewName("redirect:/");
		return mv;
	}
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public ModelAndView logout(ModelAndView mv, HttpServletRequest r) {
		r.getSession().removeAttribute("user");
		mv.setViewName("redirect:/");
		return mv;
	}
	@ResponseBody
	@RequestMapping(value = "/idcheck")
	public String idcheck(String me_id) {
		return memberService.idCheck(me_id);
	}
	
}
