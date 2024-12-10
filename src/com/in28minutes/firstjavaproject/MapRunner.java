package com.in28minutes.firstjavaproject;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		String str = "This is an awesome occasion. This has never happened before.";
		Map<Character, Integer> occurances = new HashMap<>();
		char[] chars = str.toCharArray();
		for (char c : chars) {
			Integer integer = occurances.get(c);
			if (integer == null) {
				occurances.put(c, 1);
			} else {
				occurances.put(c, integer + 1);
			}
		}

		System.out.println(occurances);

		Map<String, Integer> wordOccurances = new HashMap<>();
		String[] words = str.split(" ");
		for (String string : words) {
			Integer integer = wordOccurances.get(string);
			if (integer == null) {
				wordOccurances.put(string, 1);
			} else {
				wordOccurances.put(string, integer + 1);

			}
		}

		System.out.println(wordOccurances);
	}

}
