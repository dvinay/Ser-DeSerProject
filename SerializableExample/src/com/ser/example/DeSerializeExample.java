package com.ser.example;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.source.StudentInfo;

public class DeSerializeExample {
	public static void main(String[] args) {
		StudentInfo si = null;
		try {
			FileInputStream fis = new FileInputStream("student.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			si = (StudentInfo) ois.readObject();
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(si.name);
		System.out.println(si.rid);
		System.out.println(StudentInfo.getContact());
	}
}
