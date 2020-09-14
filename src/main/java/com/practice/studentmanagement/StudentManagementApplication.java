package com.practice.studentmanagement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
		StudentInterface stdInterface = new myClass();
		List<StudentBean> stdList = Arrays.asList(new StudentBean("Prabhanjan", 1, 30), new StudentBean("Ravi", 2, 45),
				new StudentBean("Abcde", 3, 13), new StudentBean("Bhanu", 4, 15));
		Collections.sort(stdList, new StudentComparator());
		stdList.forEach(System.out::println);
		for (StudentBean std : stdList) {
			System.out.println("Print" + std);
		}
		System.out.println("Parallel Stream print:");
		Stream<StudentBean> parallelStream = stdList.parallelStream();
		parallelStream.forEach(s->doProcess(s));
		System.out.println("Java-8 Filtering");
		Stream<StudentBean> filterAge = stdList.stream().filter(element -> element.getAge() > 15);
		filterAge.forEach(System.out::println);
		System.out.println("Java-8 Filter By Name");
		Stream<StudentBean> filterbyName = stdList.stream().filter(element -> element.getName().contains("R"));
		filterbyName.forEach(System.out::println);
		System.out.println("Java-8 filter by all String");
		boolean allMatch = stdList.stream().allMatch(element -> element.getName().contains("P"));
		System.out.println(allMatch);
		System.out.println("java8-filter any String");
		boolean anyMatch = stdList.stream().anyMatch(element -> element.getName().contains("P"));
		System.out.println(anyMatch);
		System.out.println("java 8 noneMatch");
		boolean noneMatch = stdList.stream().noneMatch(element -> element.getAge() > 55);
		System.out.println(noneMatch);
		Collections.sort(stdList, new Comparator<StudentBean>() {
			@Override
			public int compare(StudentBean s1, StudentBean s2) {
				return s1.getName().compareTo(s2.getName());
			}
		});
		System.out.println("Student Interface Static method Inside Interface:");
		StudentInterface.greet("Prabhanjan from Main Method");
		System.out.println("forEach Anonymous comparator");
		stdList.forEach(System.out::println);

		Collections.sort(stdList, (s1, s2) -> s1.getName().compareTo(s2.getName()));
		System.out.println("-------Lambda-Expression-Print-----");
		stdList.forEach(System.out::println);

		System.out.println("List Interface Comparator");
		stdList.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
		stdList.forEach(System.out::println);

		List<StudentBean> stdPrint = stdInterface.sortStdByName(stdList);
		for (StudentBean list1 : stdPrint) {
			System.out.println(list1.getName());
		}
		List<DetailBean> detail = new ArrayList<DetailBean>();
		List<String> part1 = Arrays.asList("p1", "p2", "p3");
		List<String> part2 = Arrays.asList("p1", "p5", "p4");
		DetailBean detail1 = new DetailBean(1001, part1);
		DetailBean detail2 = new DetailBean(1002, part2);
		detail.add(detail1);
		detail.add(detail2);
		Stream<String> flatMap = detail.stream().flatMap(element->element.getParts().stream());
		flatMap.forEach(System.out::println);

	}

	private static void doProcess(StudentBean s) {
		System.out.println(s);
	}

}
