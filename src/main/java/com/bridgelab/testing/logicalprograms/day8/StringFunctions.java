package com.bridgelab.testing.logicalprograms.day8;

import java.util.Arrays;
import java.util.Scanner;

public class StringFunctions {
	public static void main(String[] args) {
		System.out.println(anagram());
	}

	private static boolean anagram() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Word: ");
		String f = scanner.nextLine();
		System.out.println("Enter Second Word: ");
		String s = scanner.nextLine();
		scanner.close();
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
}
