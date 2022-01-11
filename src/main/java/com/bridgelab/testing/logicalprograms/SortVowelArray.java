package com.bridgelab.testing.logicalprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Pair {
	int first;
	String second;

	public Pair(int first, String second) {
		super();
		this.first = first;
		this.second = second;
	}
}

public class SortVowelArray {
	public static void main(String[] args) {
		String statement = "this is sample input for";
		String[] array = statement.split(" ");
		for (Pair p : sortArray(array)) {
			System.out.print(p.second + " ");
		}
	}

	private static List<Pair> sortArray(String[] array) {
		List<Pair> list = new ArrayList<Pair>();
		for (int i = 0; i < array.length; i++) {
			list.add(new Pair(countVowel(array[i]), array[i]));
		}
		Collections.sort(list, (a, b) -> b.first - a.first);
		return list;
	}

	private static int countVowel(String string) {
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (isVowel(string.charAt(i))) {
				count++;
			}
		}
		return count;
	}

	private static boolean isVowel(char c) {
		c = Character.toLowerCase(c);
		return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
	}
}
