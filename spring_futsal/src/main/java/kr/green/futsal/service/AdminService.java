package kr.green.futsal.service;

import java.util.List;

import kr.green.futsal.vo.MemberVO;

public interface AdminService {

	List<MemberVO> getMemberList();

	boolean updateAuthority(MemberVO member);
}
