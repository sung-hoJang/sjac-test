package org.sjac.model;

public class SubjectVO {
	private String subject;
	private String subjectCategory;
	public SubjectVO(String subject, String subjectCategory) {
		super();
		this.subject = subject;
		this.subjectCategory = subjectCategory;
	}
	public SubjectVO() {
		super();
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubjectCategory() {
		return subjectCategory;
	}
	public void setSubjectCategory(String subjectCategory) {
		this.subjectCategory = subjectCategory;
	}
	@Override
	public String toString() {
		return "SubjectVO [subject=" + subject + ", subjectCategory="
				+ subjectCategory + "]";
	}
	
	
}
