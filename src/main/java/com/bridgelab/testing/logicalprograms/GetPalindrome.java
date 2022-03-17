package com.bridgelab.testing.logicalprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//input = madamlkjracecar
//output = racecar, len=7
public class GetPalindrome {
	public static void main(String[] args) {
		String string = UtilScanner.getString("Enter String to get palindrome of higher length: ");
		palindrome(string);
	}

	private static void palindrome(String s) {
		List<Integer> list = new ArrayList<Integer>();
		List<String> list2 = new ArrayList<String>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					list.add(isPalindrome(s.substring(i, j + 1)));
					list2.add(isPalindrome2(s.substring(i, j + 1)));
				}
			}
		}
		Collections.sort(list);
		Collections.sort(list2, new Comparator<String>() {
			@Override
			public int compare(String string, String string2) {
				return string.length() - string2.length();
			}
		});
		System.out.println("Palindrome: " + list2.get(list.size() - 1) + ", length: " + list.get(list.size() - 1));
	}

	private static int isPalindrome(String s) {
		String temp = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			temp += s.charAt(i);
		}
		if (temp.equals(s)) {
			return s.length();
		}
		return -1;
	}

	private static String isPalindrome2(String s) {
		String temp = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			temp += s.charAt(i);
		}
		if (temp.equals(s)) {
			return temp;
		}
		return "-1";
	}
}
