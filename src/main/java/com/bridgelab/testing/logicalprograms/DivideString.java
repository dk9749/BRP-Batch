package com.bridgelab.testing.logicalprograms;

import java.util.Scanner;

public class DivideString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String string = scanner.next();
		System.out.println("How many equal parts you want to divide the word: ");
		int n = scanner.nextInt();
		divideString(string, n);
		scanner.close();
	}

	private static void divideString(String s, int n) {
		if (s.length() % n != 0) {
			System.out.println("Not Possible !!");
		} else {
			int length = s.length() / n, i = 0;
			while (i < s.length()) {
				System.out.println(s.substring(i, i + length));
				i = i + length;
			}
		}
	}
}
