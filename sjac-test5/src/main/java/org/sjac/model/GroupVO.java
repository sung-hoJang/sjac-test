package org.sjac.model;

public class GroupVO {
	private String gName;
	private SubjectVO subjectVO;
	private String gInfo;
	private int gCount;
	private String gLocation;
	public GroupVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GroupVO(String gName, SubjectVO subjectVO, String gInfo, int gCount,
			String gLocation) {
		this.gName = gName;
		this.subjectVO = subjectVO;
		this.gInfo = gInfo;
		this.gCount = gCount;
		this.gLocation = gLocation;
	}
	public String getgName() {
		return gName;
	}
	public void setgName(String gName) {
		this.gName = gName;
	}
	public SubjectVO getSubjectVO() {
		return subjectVO;
	}
	public void setSubjectVO(SubjectVO subjectVO) {
		this.subjectVO = subjectVO;
	}
	public String getgInfo() {
		return gInfo;
	}
	public void setgInfo(String gInfo) {
		this.gInfo = gInfo;
	}
	public int getgCount() {
		return gCount;
	}
	public void setgCount(int gCount) {
		this.gCount = gCount;
	}
	public String getgLocation() {
		return gLocation;
	}
	public void setgLocation(String gLocation) {
		this.gLocation = gLocation;
	}
	@Override
	public String toString() {
		return "GroupVO [gName=" + gName + ", subjectVO=" + subjectVO
				+ ", gInfo=" + gInfo + ", gCount=" + gCount + ", gLocation="
				+ gLocation + "]";
	}
	
	
	
}
