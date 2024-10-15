package com.testcases.demo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.shristi.training.Student;

class CheckerTest {

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
	void testCheckName1() {
		assertFalse(student.checkName("Kevin"));
	}

	@Test
	void testCheckName2() {
		assertTrue(student.checkName("Sri"));
	}
	@Test
	void testCheckName3() {
		assertTrue(student.checkName("Mridhula"));
	}
	@Tag("prod")
	@Test
	void testCheckName4() {
		assertTrue(student.checkName("Henry"));
		assertTrue(student.checkName("Jerry"));
	}
}
