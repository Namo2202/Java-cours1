package com.in28minutes.firstjavaproject;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student(String name, int... marks) {
		this.name = name;
		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfMarks() {
		return this.marks.size();
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int i : marks) {
			sum += i;
		}
		return sum;
	}

	public int getMaximumMark() {
//		int max = Integer.MIN_VALUE;
//		for (int i : marks) {
//			if (i > max) {
//				max = i;
//			}
//		}
//		return max;
		return Collections.max(marks);
	}

	public int getMinimumMark() {
//		int min = Integer.MAX_VALUE;
//		for (int i : marks) {
//			if (i < min) {
//				min = i;
//			}
//		}
//		return min;
		return Collections.min(marks);
	}

	public BigDecimal getAverageMarks() {
		BigDecimal totalSum = BigDecimal.valueOf(getTotalSumOfMarks());
		BigDecimal numberOfMarks = BigDecimal.valueOf(getNumberOfMarks());
		BigDecimal average = totalSum.divide(numberOfMarks, 3, RoundingMode.UP);
		return average;
	}

	public String toString() {
		return name + marks;
	}

	public void addNewMark(int i) {
		this.marks.add(i);
	}

	public void removeMarAtIndex(int index) {
		this.marks.remove(index);
	}

}
