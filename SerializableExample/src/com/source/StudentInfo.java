package com.source;

import java.io.Serializable;

public class StudentInfo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	public String name;
	public int rid;
	public static String contact;

	public StudentInfo(String n, int r, String c) {
		this.name = n;
		this.rid = r;
		StudentInfo.setContact(c);
	}

	public static String getContact() {
		return contact;
	}

	public static void setContact(String contact) {
		StudentInfo.contact = contact;
	}
}
