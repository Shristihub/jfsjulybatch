package com.shristi.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleRead {

	public static void main(String[] args) {
		// take input as bytes and converts to character
		InputStreamReader inStreamReader = new InputStreamReader(System.in);
		// buffers the character and reads it
		BufferedReader reader = new BufferedReader(inStreamReader);

		char val;
		try {
			val = (char) reader.read();// hello welcome
			System.out.println(val); // h
			do {
				val = (char) reader.read(); // e
				System.out.println(val);// e
			} while (val != 'q');

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
