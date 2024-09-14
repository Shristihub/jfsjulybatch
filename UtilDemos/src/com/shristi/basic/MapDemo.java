package com.shristi.basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {
	public static void main(String[] args) {
		Map<Department, List<Student>> map = new HashMap<Department, List<Student>>();
		Department dept1 = new Department(1, "ECE");
		Department dept2 = new Department(2, "CSE");
		Department dept3 = new Department(3, "CIVIL");
		Department dept4 = new Department(4, "EEE");
		List<Student> eceStud = Arrays.asList(new Student("Jeevan", "Banglore"), new Student("Prakash", "GADAG"),
				new Student("Pramod", "Dharwad"));
		List<Student> cseStud = Arrays.asList(new Student("Satish", "Banglore"), new Student("Sagar", "GADAG"),
				new Student("Shrikanth", "Dharwad"));
		List<Student> civilStud = Arrays.asList(new Student("Ganesh", "Banglore"), new Student("Chandru", "GADAG"),
				new Student("Suresh", "Dharwad"));
		List<Student> eeeStud = Arrays.asList(new Student("Jeevan", "Banglore"));
		map.put(dept1, eceStud);
		map.put(dept2, cseStud);
		map.put(dept3, civilStud);
		map.put(dept4, null);
		for (Department key : map.keySet()) {
			List<Student> students = map.get(key);
			System.out.println("-----------------------------------------");
			System.out.println("Student Details in " + key + " Department:");
			System.out.println("-----------------------------------------");
			System.out.println(students);
			if (students != null) {
				for (Student student : students) {
					System.out.println(student);
				}

			} else {
				System.out.println("-----------------------------------------");
				map.putIfAbsent(key, eeeStud);
				System.out.println(map.get(key));
				System.out.println("No student details available for " + key + " Department.");
				System.out.println("-----------------------------------------");
			}

		}

	}

}

class Department {
	private int deptId;
	private String deptName;

	public Department(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}

	public Department() {
		super();
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Depetment [deptId=" + deptId + ", deptName=" + deptName + "]";
	}

}

class Student {
	private String studName;
	private String city;

	public Student() {
		super();
	}

	public Student(String studName, String city) {
		super();
		this.studName = studName;
		this.city = city;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [studName=" + studName + ", city=" + city + "]";
	}

}
