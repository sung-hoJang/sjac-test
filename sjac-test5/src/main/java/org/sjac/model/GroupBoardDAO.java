package org.sjac.model;

import java.util.List;
import java.util.Map;

public interface GroupBoardDAO {

	public  void writeGroupBoard(GroupBoardVO gbvo);	

	public  List<GroupBoardVO> getGroupBoardList(String pageNo);

	public   GroupBoardVO showGroupBoardContent(int no);

	public  void updateCount(int no);			// 조회수 +1 하는 거

	public  void deleteGroupBoardContent(String no);

	public  void updateGroupBoardContent(GroupBoardVO bvo);

	public  int totalContent();

}