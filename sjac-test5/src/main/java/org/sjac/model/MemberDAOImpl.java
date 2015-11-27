package org.sjac.model;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class MemberDAOImpl implements MemberDAO{
			@Resource
private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public MemberVO findMemberById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberVO login(MemberVO vo) {
		System.out.println(vo);
		return sqlSessionTemplate.selectOne("member.login",vo);
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
