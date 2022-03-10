package kr.green.futsal.service;

import kr.green.futsal.vo.MemberVO;

public interface MemberService {

	boolean signup(MemberVO user);

	boolean idDuplicated(String id);

	MemberVO login(MemberVO member);

	MemberVO updateMember(MemberVO input, MemberVO user);

	String findId(MemberVO member);

	String findPw(MemberVO member);
	
}
