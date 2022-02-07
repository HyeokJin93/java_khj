package kr.green.spring.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import kr.green.spring.vo.MemberVO;

public interface MemberDAO {
	// select문을 씀 - select를 제외한 나머지는 리턴타입이 없음.	
	MemberVO getMember(@Param("me_id")String me_id);
	// insert문을 씀 - 추가하고 끝나기 때문에 리턴타입이 없음	
	void insertMember(@Param("user")MemberVO user);
	void updateMember(@Param("user")MemberVO input);
	MemberVO findMember(@Param("user")MemberVO member);
	List<MemberVO> selectMemberList();
	void updateAutoLogin(@Param("user")MemberVO user);
	MemberVO selectMemberBySessionId(@Param("me_session_id")String me_session_id);
}
