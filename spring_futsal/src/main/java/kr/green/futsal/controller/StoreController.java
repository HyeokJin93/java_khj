package kr.green.futsal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.green.futsal.service.StoreService;
import kr.green.futsal.vo.FieldVO;
import kr.green.futsal.vo.StoreVO;

@Controller
public class StoreController {

	@Autowired
	StoreService storeService;
	
	@RequestMapping(value = "/store/register", method = RequestMethod.GET)
	public ModelAndView registerGet(ModelAndView mv) {
		mv.setViewName("/store/register");
		return mv;
	}
	@RequestMapping(value = "/store/register", method = RequestMethod.POST)
	public ModelAndView registerPost(ModelAndView mv,StoreVO store) {
		System.out.println(store);
		if(storeService.registerStore(store)) {
			mv.setViewName("redirect:/");
		}else{
			mv.setViewName("redirect:/store/register");
		}
		return mv;
	}
	
	@RequestMapping(value = "/store/detail", method = RequestMethod.GET)
	public ModelAndView detailGet(ModelAndView mv) {
		mv.setViewName("/store/detail");
		return mv;
	}
	@RequestMapping(value = "/store/detail", method = RequestMethod.POST)
	public ModelAndView detailPost(ModelAndView mv, FieldVO field) {
		System.out.println(field);
		if(storeService.registerStore(store)) {
			mv.setViewName("redirect:/");
		}else{
			mv.setViewName("redirect:/store/detail");
		}
		return mv;
	}
}
