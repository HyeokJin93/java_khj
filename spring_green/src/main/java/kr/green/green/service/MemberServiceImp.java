package kr.green.green.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import kr.green.green.dao.MemberDAO;
import kr.green.green.vo.MemberVO;

@Service
public class MemberServiceImp implements MemberService{

	@Autowired
	MemberDAO memberDao;
	@Autowired
	BCryptPasswordEncoder passwordEncoder;

	@Override
	public boolean signup(MemberVO user) {
		// 회원가입 안되는 경우 확인해서 회원가입 진행
		
		//회원정보가 없는 경우
		if(user == null)
			return false;
		//아이디가 없거나 공백인 경우
		if(user.getMe_id() == null | user.getMe_id().trim().length() == 0)
			return false;
		//비밀번호가 없거나 공백인 경우
		if(user.getMe_pw() == null)
			return false;
		if(user.getMe_address() == null)
			return false;
		if(user.getMe_birth() == null)
			return false;
		if(user.getMe_gender() == null)
			return false;
		if(user.getMe_name() == null)
			return false;
		if(user.getMe_phone() == null)
			return false;
		// 암호화
		String encPw = passwordEncoder.encode(user.getMe_pw());
		user.setMe_pw(encPw);
		
		// 다오에게 일을시킴
		memberDao.insertMember(user);
		return true;
	}

	@Override
	public MemberVO login(MemberVO user) {
		if(user == null || user.getMe_id() == null 
				|| user.getMe_id().trim().length() == 0) 
			return null;
		MemberVO dbUser = memberDao.selectMember(user.getMe_id());
		if(dbUser == null)
			return null;
		// matches(원래 비번과 암호화된 비번) : 같으면(비번이 맞으면)
		if(!passwordEncoder.matches(user.getMe_pw(),dbUser.getMe_pw()))
			return null;
		return dbUser;
	}
}


