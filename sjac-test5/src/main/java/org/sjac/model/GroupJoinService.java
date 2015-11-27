package org.sjac.model;

import java.util.List;

public interface GroupJoinService {
	//가입 요청 정보 게시글 리스트 얻어오기
	public List<GroupJoinVO> getAllJoinRequestList();
	
	//가입 승인
	public void acceptGroupMember(GroupJoinVO vo);
	
}
