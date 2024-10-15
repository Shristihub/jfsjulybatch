package com.testcases.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import java.security.InvalidAlgorithmParameterException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.shristi.exception.InvalidMarksException;
import com.shristi.training.Student;

public class StudentTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
	private Student student; 
	@BeforeEach
	void setUp() throws Exception {
		student = new Student();
	}

	@AfterEach
	void tearDown() throws Exception {
		student=null;
	}

	@Test
	@DisplayName("Testing Total marks")
	void testTotalMarks() {
		int actual = student.totalMarks(90,90,80);
		assertEquals(260,actual,"no match");
	}
	@Test
	@DisplayName("Testing Neg Total marks")
	void testNegTotalMarks() {
		assertThrows(InvalidMarksException.class, ()->student.totalMarks(-90,90,80));
	}
	@Test
	@DisplayName("Testing Greater Total marks")
	void testGreaterTotalMarks() {
		assertThrows(InvalidMarksException.class, ()->student.totalMarks(90,290,180));
	}

}
