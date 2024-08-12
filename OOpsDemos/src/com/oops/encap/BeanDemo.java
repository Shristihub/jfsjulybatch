package com.oops.encap;

public class BeanDemo {

	public static void main(String[] args) {
		Student student = new Student();
		student.setStudentName("Sri");
		student.setMobile(9393230);
		student.setStudentId(10);
		student.setNewEnrollment(true);
		
		System.out.println(student.getStudentName());
		System.out.println(student.getStudentId());
		System.out.println(student.isNewEnrollment());
		
		System.out.println(student);
	}
}
