package org.sjac.model;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class GroupDAOImpl implements GroupDAO{
	@Resource
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public GroupVO findGroupByLeaderId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GroupVO> findGroupListByGroupTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GroupVO> findGroupListByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GroupVO> findGroupListByLocation(String location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkMyGroup(Map<String, String> map) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<GroupVO> getAllMyGroup(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void enterGroup(Map<String, String> map) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateGroupInfo(GroupVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteGroupByLeaderId(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createGroup(GroupVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<GroupVO> getAllGroupList() {
		return sqlSessionTemplate.selectList("group.getAllGroupList");
	}

}
