package com.bridgelab.testing.logicalprograms;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Statement to reverse: ");
		String statement = scanner.nextLine();
		reverseString(statement);
		scanner.close();
	}

	private static void reverseString(String statement) {
		String[] s = statement.split(" ");
		String[] temp = new String[s.length];
		for (int i = 0; i < s.length; i++) {
			temp[i] = reverse(s[i]);
		}
		for (String z : temp) {
			System.out.print(z + " ");
		}
	}

	private static String reverse(String string) {
		String temp = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			temp += string.charAt(i);
		}
		return temp;
	}
}
