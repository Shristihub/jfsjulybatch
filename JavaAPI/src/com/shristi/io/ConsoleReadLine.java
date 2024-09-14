package com.shristi.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReadLine {
	public static void main(String[] args) throws IOException {
		InputStreamReader inStreamReader = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(inStreamReader);
		String value = reader.readLine();
		System.out.println(value);
		do {
			value = reader.readLine();
			System.out.println(value); // writing into console
		}while(!value.equals("stop"));
	}

}
