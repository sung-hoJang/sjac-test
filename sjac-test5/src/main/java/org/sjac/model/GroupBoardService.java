package org.sjac.model;

import java.util.List;

public interface GroupBoardService {
	public  void writeGroupBoard(GroupBoardVO gbvo);	

	public  List<GroupBoardVO> getGroupBoardList(String pageNo);

	public   GroupBoardVO showGroupBoardContent(int no);
	public GroupBoardVO showGroupBoardContentNoHit(int no);

	public  void deleteGroupBoardContent(String no);

	public  void updateGroupBoardContent(GroupBoardVO bvo);

}
