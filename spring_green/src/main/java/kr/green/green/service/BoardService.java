package kr.green.green.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kr.green.green.vo.BoardVO;
import kr.green.green.vo.MemberVO;

public interface BoardService {

	List<BoardVO> getBoardList(String bd_type);

	BoardVO getBoard(Integer bd_num);

	void registerBoard(BoardVO board, MemberVO user, List<MultipartFile> files);

	void modifyBoard(BoardVO board, MemberVO user);

	void deleteBoard(MemberVO user, Integer bd_num);



}
