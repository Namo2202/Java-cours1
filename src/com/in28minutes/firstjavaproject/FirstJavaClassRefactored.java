package com.in28minutes.firstjavaproject;

public class FirstJavaClassRefactored {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3 };
		int sum = calculateSumForNNumbers(numbers);
		// TODO Auto-generated method stub
		System.out.println(sum);
	}

	private static int calculateSumForNNumbers(int[] numbers) {
		int result = 0;
		for (int number : numbers) {
			result += number;
		}
		return result;
	}

}
