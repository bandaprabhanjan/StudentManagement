package com.practice.studentmanagement;

import java.util.Collections;
import java.util.List;

public class myClass implements StudentInterface {
	public List<StudentBean> sortStdByName(List<StudentBean> stuList) {
		Collections.sort(stuList);
		return stuList;

	}

}
