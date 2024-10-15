package com.mockito.testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import com.shristi.training.Checker;

@ExtendWith(MockitoExtension.class)
class CheckerTest {

	// creates a proxy;
	@Mock
	Checker checker;
	
	// a original object is created
	@Spy
	Checker checkerspy; // = new Checker(); 
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}


	@BeforeEach
	void setUp() throws Exception {
//		checker = new Checker();
	}

    @Test
    void testPrintMessage() {
    	// called second - 2
    	// calling the proxy not original method
    	when(checker.printMessage()).thenReturn("great day");
    	// this is called first -1
    	String actual = checker.printMessage();
    	assertEquals("great day", actual);
    }
    
    @Test
    void testPrintMessageSpy() {
    	//calling the original method
    	String actual = checkerspy.printMessage();
    	assertEquals("great day", actual);
    }
}
