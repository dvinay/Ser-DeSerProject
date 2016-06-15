package com.ser.example;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.source.StudentInfo;

public class SerializeExample {
	public static void main(String[] args) {
		try {
			StudentInfo si = new StudentInfo("Abhi", 104, "110044");
			FileOutputStream fos = new FileOutputStream("student.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(si);
			oos.close();
			fos.close();
			System.out.println("Serialization is done and save in a file : student.ser");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
