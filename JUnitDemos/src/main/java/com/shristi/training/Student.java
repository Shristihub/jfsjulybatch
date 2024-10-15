package com.shristi.training;

import com.shristi.exception.InvalidMarksException;

public class Student {

	public int totalMarks(int m1, int m2, int m3) {
		if (m1 < 0 || m2 < 0 || m3 < 0 || m1 > 100 || m2 > 100 || m3 > 100)
			throw new InvalidMarksException();
		return m1 + m2 + m3;
	}

	public String greetUser(String name) {
		return "Welcome ".toUpperCase() + name.toUpperCase() + "!!!";
	}

	public boolean checkName(String name) {
		if (name.contains("r"))
			return true;
		else
			return false;
	}
}
