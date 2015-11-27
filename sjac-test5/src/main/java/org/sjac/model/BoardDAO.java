package org.sjac.model;

import java.util.List;;

public interface BoardDAO {

	public  void write(BoardVO bvo);	

	public  List<BoardVO> getBoardList(String pageNo);

	public  BoardVO showContent(int no);

	public  void updateCount(int no);

	public  void deleteBoard(String no);

	public  void updateBoard(BoardVO bvo);

	public  int totalContent();

}