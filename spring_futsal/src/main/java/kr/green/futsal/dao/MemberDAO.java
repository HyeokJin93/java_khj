package kr.green.futsal.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import kr.green.futsal.vo.MemberVO;

public interface MemberDAO {

	MemberVO getMember(@Param("me_id")String me_id);

	void insertMember(@Param("user")MemberVO user);

	void updateMember(@Param("user")MemberVO input);

	MemberVO findMember(@Param("user")MemberVO member);

	List<MemberVO> selectMemberList();

	void updateAutoLogin(@Param("user")MemberVO user);

	MemberVO selectMemberBySessionId(@Param("me_session_id")String me_session_id);
	
}
