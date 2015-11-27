package org.sjac.model;

import java.util.List;
import java.util.Map;

public interface GroupService {
	public GroupVO findGroupByLeaderId(String id);//그룹장 아이디로 그룹정보 조회
	public List<GroupVO> findGroupListByGroupTitle(String title);
	public List<GroupVO> findGroupListByCategory(String category);
	public List<GroupVO> findGroupListByLocation(String location);
	//내가 속한 그룹인지 확인, 앞 쪽 스트링은 "memberId" 혹은 "groupLeaderId" 입력, 뒷 쪽 스트링은 해당 id 삽입
	public boolean checkMyGroup(Map<String, String> map);
	public List<GroupVO> getAllMyGroup(String id);//내가 속한 모든 그룹 보기(마이페이지)
	//그룹에 가입할 때 , 앞 쪽 스트링은 "memberId" 혹은 "groupLeaderId" 입력, 뒷 쪽 스트링은 해당 id 삽입
	public void enterGroup(Map<String, String> map);
	
	//관리자만 가능.
	public void deleteGroupByLeaderId(String id);//그룹장 아이디를 통해 그룹삭제
	public void createGroup(GroupVO vo);//그룹 생성
	public List<GroupVO> getAllGroupList();//그룹 정보 리스트 조회
}
