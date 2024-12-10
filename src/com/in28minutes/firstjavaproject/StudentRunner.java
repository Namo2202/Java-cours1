package com.in28minutes.firstjavaproject;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
//		int[] marks = { 17, 20, 30 };
		Student student = new Student("Namo", 57, 9, 3);

		int number = student.getNumberOfMarks();
		int sum = student.getTotalSumOfMarks();
		int maximumMark = student.getMaximumMark();
		int minimumMark = student.getMinimumMark();
		BigDecimal average = student.getAverageMarks();

		System.out.println(number);
		System.out.println(sum);
		System.out.println(maximumMark);
		System.out.println(minimumMark);
		System.out.println(average);
		System.out.println(student.toString());
		student.addNewMark(68);
		System.out.println(student.toString());
		student.removeMarAtIndex(1);
		System.out.println(student.toString());
//		System.out.println(extracted("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Saturday"));

	}

//	private static String extracted(String... days) {
////		String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Saturday"};
//		String dayWithMostLetters = "";
//		for (String day : days) {
//			if (day.length() > dayWithMostLetters.length()) {
//				dayWithMostLetters = day;
//			}
//		}
//		return dayWithMostLetters;
//	}

}
