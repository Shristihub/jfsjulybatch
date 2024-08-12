package com.oops.encap;

public class Student {
	private String studentName;
	private int studentId;
	private long mobile;
	private boolean newEnrollment;
	
	public void setStudentName(String name) {
		this.studentName = name;
	}
	public String getStudentName() {
		return studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public boolean isNewEnrollment() {
		return newEnrollment;
	}
	public void setNewEnrollment(boolean newEnrollment) {
		this.newEnrollment = newEnrollment;
	}
	@Override
	public String toString() {
		return "Student (studentName=" + studentName + ", studentId=" + studentId + ", mobile=" + mobile
				+ ", newEnrollment=" + newEnrollment + ")";
	}
	

}
