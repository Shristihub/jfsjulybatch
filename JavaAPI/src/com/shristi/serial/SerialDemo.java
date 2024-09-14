package com.shristi.serial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialDemo {

	public static void main(String[] args) {
		Student student = new  Student("Raju", 10, "CSE");
		try(
		FileOutputStream fs = new FileOutputStream("stud.ser");
		ObjectOutputStream os = new ObjectOutputStream(fs);
				){
		os.writeObject(student);
		System.out.println("Serialized "+ student);
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
