package com.shristi.io;

import java.io.FileReader;

public class FileToConsole {

	public static void main(String[] args) {
		
		try(
			FileReader reader = new FileReader("demo.txt");
				){
			int val = reader.read();
			System.out.print((char)val);
			do {
				val = reader.read();
			    System.out.print((char)val);
			} while (val != -1); // check for eof
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
