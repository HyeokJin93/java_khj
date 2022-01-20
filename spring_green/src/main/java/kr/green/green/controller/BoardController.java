package kr.green.green.controller;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import kr.green.green.pagination.Criteria;
import kr.green.green.pagination.PageMaker;
import kr.green.green.service.BoardService;
import kr.green.green.vo.BoardVO;
import kr.green.green.vo.FileVO;
import kr.green.green.vo.MemberVO;

@Controller
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping(value="/board/list", method=RequestMethod.GET)
	public ModelAndView boardListGet(ModelAndView mv, Criteria cri) {
		List<BoardVO> list = boardService.getBoardList("일반", cri);
		int totalCount = boardService.getTotalCount(cri);
		PageMaker pm = new PageMaker(totalCount, 5, cri);
		mv.addObject("pm",pm);
		mv.addObject("list",list);
		mv.setViewName("/board/list");
		return mv;
	}
	@RequestMapping(value="/board/detail", method=RequestMethod.GET)
	public ModelAndView boardDetail(ModelAndView mv, Integer bd_num) {
		BoardVO board = boardService.getBoard(bd_num);
		// 게시글 번호와 일치하는 첨부파일을 가져오라고 시킴
		List<FileVO> fileList = boardService.getFileList(bd_num);
		mv.addObject("fileList",fileList);
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
	public ModelAndView boardRegistertPost(ModelAndView mv, BoardVO board,
			HttpServletRequest r, List<MultipartFile> files) {
		MemberVO user = (MemberVO)r.getSession().getAttribute("user");
		// board.setBd_me_id(user.getMe_id());
		board.setBd_type("일반");
		boardService.registerBoard(board, user, files);
		mv.setViewName("redirect:/board/list");
		return mv;
	}
	@RequestMapping(value="/board/modify", method=RequestMethod.GET)
	public ModelAndView boardModifyGet(ModelAndView mv, Integer bd_num,HttpServletRequest r) {
		MemberVO user = (MemberVO)r.getSession().getAttribute("user");
		
		BoardVO board = boardService.getBoard(bd_num);
		List<FileVO>fileList = boardService.getFileList(bd_num);
		
		if(user != null && board !=null &&
				user.getMe_id().equals(board.getBd_me_id())) {
			mv.addObject("board",board);
			mv.addObject("fileList",fileList);
			mv.setViewName("/board/modify");	
		}else {
			mv.addObject("bd_num",bd_num);
			mv.setViewName("redirect:/board/detail");
		}
		return mv;
	}
	@RequestMapping(value="/board/modify", method=RequestMethod.POST)
	public ModelAndView boardModifyPost(ModelAndView mv, BoardVO board,
			HttpServletRequest r, List<MultipartFile> files2, Integer [] fileNums) {
		/* 
		// 잘 넘어오는지 확인
		if(fileNums != null) {
			for(Integer tmp : fileNums)
				System.out.println("게시글 번호 : " + tmp);
		}
		// 잘 넘어오는지 확인
		if(files2 != null) {
			for(MultipartFile tmp : files2) 
				System.out.println("첨부파일명 : " + tmp.getOriginalFilename());
		}
		*/
		MemberVO user = (MemberVO)r.getSession().getAttribute("user");
		boardService.modifyBoard(board,user, files2, fileNums); 
		mv.addObject("bd_num", board.getBd_num());
		mv.setViewName("redirect:/board/detail");
		return mv;
	}
	@RequestMapping(value="/board/delete", method=RequestMethod.GET)
	public ModelAndView boardDeleteGet(ModelAndView mv, Integer bd_num, HttpServletRequest r) {
		BoardVO board = boardService.getBoard(bd_num);
		MemberVO user = (MemberVO)r.getSession().getAttribute("user");
		boardService.deleteBoard(bd_num, user);
		mv.setViewName("redirect:/board/list");
		return mv;
	}
	@ResponseBody
	@RequestMapping("/board/download")
	public ResponseEntity<byte[]> downloadFile(String fileName)throws Exception{
	    InputStream in = null;
	    ResponseEntity<byte[]> entity = null;
		String uploadPath = "C:\\JAVA\\upload";
		try{
	        String FormatName = fileName.substring(fileName.lastIndexOf(".")+1);
	        HttpHeaders headers = new HttpHeaders();
	        in = new FileInputStream(uploadPath+fileName);

	        fileName = fileName.substring(fileName.indexOf("_")+1);
	        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
	        headers.add("Content-Disposition",  "attachment; filename=\"" 
				+ new String(fileName.getBytes("UTF-8"), "ISO-8859-1")+"\"");
	        entity = new ResponseEntity<byte[]>(IOUtils.toByteArray(in),headers,HttpStatus.CREATED);
	    }catch(Exception e) {
	        e.printStackTrace();
	        entity = new ResponseEntity<byte[]>(HttpStatus.BAD_REQUEST);
	    }finally {
	        in.close();
	    }
	    return entity;
	}
	
}