package org.sjac.model;



public interface BoardService {
	public  void write(BoardVO bvo);				
	public  ListVO getBoardList(String pageNo);
	public  BoardVO showContent(int no);	
	public BoardVO showContentNoHit(int no);
	public  void deleteBoard(String no);
	public  void updateBoard(BoardVO bvo);
}