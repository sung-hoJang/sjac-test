package org.sjac.model;

public class GroupBoardVO {
	private int gbNo;
	private String gbCategory;
	private String gbTitle;
	private String gbContent;
	private String gbDate;
	private int gbHits;
	private MemberVO memberVO;
	private GroupVO groupVO;
	public GroupBoardVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GroupBoardVO(int gbNo, String gbCategory, String gbTitle,
			String gbContent, String gbDate, int gbHits, MemberVO memberVO,
			GroupVO groupVO) {
		super();
		this.gbNo = gbNo;
		this.gbCategory = gbCategory;
		this.gbTitle = gbTitle;
		this.gbContent = gbContent;
		this.gbDate = gbDate;
		this.gbHits = gbHits;
		this.memberVO = memberVO;
		this.groupVO = groupVO;
	}
	public int getGbNo() {
		return gbNo;
	}
	public void setGbNo(int gbNo) {
		this.gbNo = gbNo;
	}
	public String getGbCategory() {
		return gbCategory;
	}
	public void setGbCategory(String gbCategory) {
		this.gbCategory = gbCategory;
	}
	public String getGbTitle() {
		return gbTitle;
	}
	public void setGbTitle(String gbTitle) {
		this.gbTitle = gbTitle;
	}
	public String getGbContent() {
		return gbContent;
	}
	public void setGbContent(String gbContent) {
		this.gbContent = gbContent;
	}
	public String getGbDate() {
		return gbDate;
	}
	public void setGbDate(String gbDate) {
		this.gbDate = gbDate;
	}
	public int getGbHits() {
		return gbHits;
	}
	public void setGbHits(int gbHits) {
		this.gbHits = gbHits;
	}
	public MemberVO getMemberVO() {
		return memberVO;
	}
	public void setMemberVO(MemberVO memberVO) {
		this.memberVO = memberVO;
	}
	public GroupVO getGroupVO() {
		return groupVO;
	}
	public void setGroupVO(GroupVO groupVO) {
		this.groupVO = groupVO;
	}
	@Override
	public String toString() {
		return "GroupBoardVO [gbNo=" + gbNo + ", gbCategory=" + gbCategory
				+ ", gbTitle=" + gbTitle + ", gbContent=" + gbContent
				+ ", gbDate=" + gbDate + ", gbHits=" + gbHits + ", memberVO="
				+ memberVO + ", groupVO=" + groupVO + "]";
	}
	
	
	
}
