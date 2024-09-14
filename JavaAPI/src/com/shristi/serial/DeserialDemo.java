package com.shristi.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserialDemo {

	public static void main(String[] args) {

		// open the file
		try(
		FileInputStream fin = new FileInputStream("stud.ser");
		ObjectInputStream oin = new ObjectInputStream(fin);
				){
		Student student = (Student)oin.readObject();
		System.out.println(student);
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("error...");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("exception....");
			e.printStackTrace();
		}
	}

}
