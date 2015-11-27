package org.sjac.model;

import java.util.List;

public interface MemberService {
	public MemberVO findMemberById(String id);// 아이디를 통해 멤버 검색
	public MemberVO login(MemberVO vo);// 아이디 패스워드 통해 로그인
	public void register(MemberVO vo);// 회원가입
	public void deleteMemberById(String id);//아이디를 통해 회원 삭제 및 탈퇴
	public void updateMyInfo(MemberVO vo);// 회원 개인 정보를 수정
	// 여기서부터 관리자만 가능. 시작!!
	public List<MemberVO> getAllMemberList();//모든 멤버 리스트 가져오기.
}
