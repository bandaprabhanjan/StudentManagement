package com.practice.studentmanagement;

import java.util.Comparator;

public class StudentComparator implements Comparator<StudentBean> {

	@Override
	public int compare(StudentBean s1, StudentBean s2) {
		return s1.getName().compareTo(s2.getName());
	}

}
