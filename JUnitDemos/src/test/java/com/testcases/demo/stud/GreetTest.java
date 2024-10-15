package com.testcases.demo.stud;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.shristi.training.Student;

class GreetTest {

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
	@Tag("prod")
	void testGreet() {
		String username = "Kevin";
		String actual = student.greetUser(username);
		assertEquals("WELCOME KEVIN!!!",actual);
	}

}
