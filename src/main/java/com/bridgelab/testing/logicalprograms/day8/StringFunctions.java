package com.bridgelab.testing.logicalprograms.day8;

import java.util.Arrays;
import java.util.Scanner;

public class StringFunctions {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(anagram());
		System.out.println("--------------");
		System.out.println(palindrome());
		System.out.println("--------------\nPermutations:-");
		permutations();
	}

	private static boolean anagram() {
		System.out.println("Check Anagram\nEnter First Word: ");
		String f = scanner.nextLine();
		System.out.println("Enter Second Word: ");
		String s = scanner.nextLine();
		String a = f.replaceAll("\\s", "");
		String b = s.replaceAll("\\s", "");
		char[] a1 = a.toLowerCase().toCharArray();
		char[] b1 = b.toLowerCase().toCharArray();
		sort(a1);
		sort(b1);
		if (a.length() != b.length()) {
			return false;
		} else {
			if (Arrays.equals(a1, b1)) {
				return true;
			}
		}
		return false;
	}

	private static char[] sort(char[] a1) {
		char temp;
		for (int i = 0; i < a1.length; i++) {
			for (int j = i + 1; j < a1.length; j++) {
				if (a1[i] > a1[j]) {
					temp = a1[i];
					a1[i] = a1[j];
					a1[j] = temp;
				}
			}
		}
		return a1;
	}

	private static boolean palindrome() {
		System.out.println("Check Palindrome\nEnter Word: ");
		String s1 = scanner.next();
		String s2 = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			s2 += s1.charAt(i);
		}
		if (s1.equals(s2)) {
			return true;
		}
		return false;
	}

	private static void permutations() {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		scanner.close();
		if (s == null || s.length() == 0) {
			return;
		}
		if (s.length() == 1) {
			System.out.println(s);
			return;
		}
		s = s.toUpperCase();
		char[] c = s.toCharArray();
		sort(c);
		while (true) {
			System.out.println(String.valueOf(c) + " ");
			int i = s.length() - 1;
			while (c[i - 1] >= c[i]) {
				if (--i == 0) {
					return;
				}
			}
			int j = s.length() - 1;
			while (j > i && c[j] <= c[i - 1]) {
				j--;
			}
			swap(c, i - 1, j);
			reverse(c, i, s.length() - 1);
		}
	}

	private static void reverse(char[] c, int i, int j) {
		while (i < j) {
			swap(c, i++, j--);
		}
	}

	private static void swap(char[] c, int i, int j) {
		char temp = c[i];
		c[i] = c[j];
		c[j] = temp;
	}
}
