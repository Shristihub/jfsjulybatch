package com.shristi.io;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class TryResourceConsoleToFile {

	public static void main(String[] args) {
		InputStreamReader inStreamReader = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(inStreamReader);
		// create FileOutputStream true to append the file

		try (
			FileOutputStream outputStream = new FileOutputStream("demo.txt", true);
			) {
			int val = reader.read();
			outputStream.write(val);// saving it to file
			do {
				val = reader.read();
//				System.out.println(val);
				outputStream.write(val);
			} while ((char) val != 'q');
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
