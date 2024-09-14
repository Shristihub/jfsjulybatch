package com.shristi.io;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleToFile {

	public static void main(String[] args) {
		InputStreamReader inStreamReader = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(inStreamReader);
		FileOutputStream outputStream = null;
		try {
			// create FileOutputStream
//			true to append the file
			outputStream = new FileOutputStream("demo.txt", true );

			int val = reader.read();
			outputStream.write(val);// saving it to file
			do {
				val = reader.read();
//			    System.out.println(val);
				outputStream.write(val);
			} while ((char) val != 'q');
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(outputStream!=null)
				   outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
