package kr.green.green.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.green.green.service.BoardService;
import kr.green.green.vo.BoardVO;
import kr.green.green.vo.MemberVO;

@Controller
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping(value="/board/list", method=RequestMethod.GET)
	public ModelAndView boardListGet(ModelAndView mv) {
		List<BoardVO> list = boardService.getBoardList("일반");
		mv.addObject("list",list);
		mv.setViewName("/board/list");
		return mv;
	}
	@RequestMapping(value="/board/detail", method=RequestMethod.GET)
	public ModelAndView boardDetail(ModelAndView mv, Integer bd_num) {
		BoardVO board = boardService.getBoard(bd_num);
		mv.addObject("board",board);
		mv.setViewName("/board/detail");
		return mv;
	}
	@RequestMapping(value="/board/register", method=RequestMethod.GET)
	public ModelAndView boardRegistertGet(ModelAndView mv) {
		mv.setViewName("/board/register");
		return mv;
	}
	@RequestMapping(value="/board/register", method=RequestMethod.POST)
	public ModelAndView boardRegistertPost(ModelAndView mv, BoardVO board, HttpServletRequest r) {
		MemberVO user = (MemberVO)r.getSession().getAttribute("user");
		// board.setBd_me_id(user.getMe_id());
		board.setBd_type("일반");
		boardService.registerBoard(board, user);
		mv.setViewName("redirect:/board/list");
		return mv;
	}
	@RequestMapping(value="/board/modify", method=RequestMethod.GET)
	public ModelAndView boardModifyGet(ModelAndView mv, Integer bd_num,HttpServletRequest r) {
		MemberVO user = (MemberVO)r.getSession().getAttribute("user");
		BoardVO board = boardService.getBoard(bd_num);
		if(user != null && board !=null &&
				user.getMe_id().equals(board.getBd_me_id())) {
			mv.addObject("board",board);
			mv.setViewName("/board/modify");	
		}else {
			mv.addObject("bd_num",bd_num);
			mv.setViewName("redirect:/board/detail");
		}
		return mv;
	}
	@RequestMapping(value="/board/modify", method=RequestMethod.POST)
	public ModelAndView boardModifyPost(ModelAndView mv, BoardVO board, HttpServletRequest r) {
		MemberVO user = (MemberVO)r.getSession().getAttribute("user");
		boardService.modifyBoard(board,user); 
		mv.addObject("bd_num", board.getBd_num());
		mv.setViewName("redirect:/board/detail");
		return mv;
	}
	@RequestMapping(value="/board/delete", method=RequestMethod.GET)
	public ModelAndView boardDeleteGet(ModelAndView mv, Integer bd_num, HttpServletRequest r) {
		BoardVO board = boardService.getBoard(bd_num);
		MemberVO user = (MemberVO)r.getSession().getAttribute("user");
		boardService.deleteBoard(user, bd_num);
		mv.setViewName("redirect:/board/list");
		return mv;
	}
}
