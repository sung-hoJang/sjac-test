package org.sjac.model;

import java.util.List;

public interface SubjectDAO {
	public List<SubjectVO> getAllCategory();		//모든 카테고리 받아오는 함수
	public SubjectVO findCategoryBySubject(String subject);	//과목에 해당하는 카테고리 받아오는 함수
}
