package com.practice.studentmanagement;

import java.util.List;

public interface StudentInterface {

	default public List<StudentBean> sortStdByName(List<StudentBean> stdList) {
		return stdList;
	}
	public static void greet(String name) {
		System.out.println("Welcome" + name);
	}
}
