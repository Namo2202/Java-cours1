package com.in28minutes.firstjavaproject;

import java.util.Arrays;

public class AnagramsRunner {

	public static void main(String[] args) {
		String str1 = "olelh";
		String str2 = "hello";
		System.out.println(areAnagrams(str1, str2));
	}

	public static boolean areAnagrams(String str1, String str2) {
		String lowerCaseStr1 = str1.toLowerCase();
		String lowerCaseStr2 = str2.toLowerCase();
		char[] string1 = lowerCaseStr1.toCharArray();
		char[] string2 = lowerCaseStr2.toCharArray();
		Arrays.sort(string1);
		Arrays.sort(string2);
		if (string1.length == string2.length) {
			if (Arrays.equals(string1, string2)) {
				return true;
			}
		}

		return false;
	}

}
