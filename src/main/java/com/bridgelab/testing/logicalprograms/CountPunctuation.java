package com.bridgelab.testing.logicalprograms;

import java.util.Scanner;

public class CountPunctuation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter A Statement: ");
		String statement = scanner.nextLine();
		System.out.println(countPunctuation(statement));
		scanner.close();
	}

	private static int countPunctuation(String statement) {
		int i = 0, count = 0;
		while (i < statement.length()) {
			if (checkPunctuation(statement.charAt(i))) {
				count++;
			}
			i++;
		}
		return count;
	}

	private static boolean checkPunctuation(int i) {
		return i == '!' || i == '.' || i == '\"' || i == '-' || i == '?' || i == ';' || i == '\'' || i == ':'
				|| i == ',';
	}
}
