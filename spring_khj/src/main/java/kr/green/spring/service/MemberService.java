package kr.green.spring.service;

import kr.green.spring.vo.MemberVO;

public interface MemberService {

	MemberVO login(MemberVO user);

	boolean signup(MemberVO user);

	boolean idDuplicated(String id);

}
