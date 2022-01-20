package com.bridgelab.testing.logicalprograms;

import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Only 4 Words One By One: ");
		String[] s = new String[4];
		for (int i = 0; i < s.length; i++) {
			s[i] = scanner.next();
		}
		System.out.println("The Longest Common Prefix Is: " + longestCommonPrefix(s));
		scanner.close();
	}

	private static String longestCommonPrefix(String[] s) {
		Arrays.sort(s);
		int minLength = Math.min(s[0].length(), s[s.length - 1].length());
		int i = 0;
		String prefix = null;
		while (i < minLength && s[0].charAt(i) == s[s.length - 1].charAt(i)) {
			i++;
			prefix = s[0].substring(0, i);
		}
		return prefix;
	}
}
