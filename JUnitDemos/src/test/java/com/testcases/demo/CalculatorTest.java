package com.testcases.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.shristi.training.Calculator;

class CalculatorTest {

	Calculator calculator;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("runs before all testcases");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("runs after all testcases");
	}

	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
		System.out.println("runs before each testcase");
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator = null;
		System.out.println("runs after each testcase");
	}

	@Test
	@Tag("sum")
	@DisplayName("Testing sum")
	void testSum() {
		int actual = calculator.sum(10, 20);
		assertEquals(30, actual, ()->errorMessage());
	}

	public String errorMessage() {
		System.out.println("error");
		return "expected one value but got diff value";
	}

	@Test
	@DisplayName("Testing Multiply")
	void testMultiply() {
		int actual = calculator.multiply(2, 2);
		assertEquals(4, actual, ()->errorMessage());
		assertEquals(8, calculator.multiply(2, 4), ()->errorMessage());
	}
	
	
}
