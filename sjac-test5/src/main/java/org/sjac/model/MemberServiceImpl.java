package org.sjac.model;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
@Service
public class MemberServiceImpl implements MemberService{
	@Resource
	private MemberDAO memberDAO;

	@Override
	public MemberVO findMemberById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberVO login(MemberVO vo) {
		
		return memberDAO.login(vo);
	}

	@Override
	public void register(MemberVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMemberById(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateMyInfo(MemberVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<MemberVO> getAllMemberList() {
		// TODO Auto-generated method stub
		return null;
	}

}
