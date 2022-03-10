package kr.green.futsal.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import kr.green.futsal.service.AdminService;
import kr.green.futsal.vo.MemberVO;

@Controller
public class AdminController {
	@Autowired
	AdminService adminService;
	
	@RequestMapping("/admin/authority")
	public ModelAndView adminMemberList(ModelAndView mv,HttpServletRequest request) {
		MemberVO user = (MemberVO) request.getSession().getAttribute("user");
		if(user == null || !user.getMe_authority().equals("시스템 관리자")) {
			mv.setViewName("redirect:/");
		}else {
			List<MemberVO> userList = adminService.getMemberList();
			mv.addObject("list", userList);
			mv.setViewName("/admin/authority");			
		}
		return mv;
	}
	@ResponseBody
	@RequestMapping(value = "/admin/update/authority")
	public boolean adminUpdateAuthority(@RequestBody MemberVO member) {
		return adminService.updateAuthority(member);
	}
}
