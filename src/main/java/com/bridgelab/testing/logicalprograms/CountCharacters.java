package com.bridgelab.testing.logicalprograms;

import java.util.Scanner;

public class CountCharacters {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter A Statement: ");
		String statement = scanner.nextLine();
		System.out.println(countCharacters(statement));
		scanner.close();
	}

	private static int countCharacters(String statement) {
		int i = 0, count = 0, NumberOfCharacters;
		while (i < statement.length()) {
			if (statement.charAt(i) == ' ') {
				count++;
			}
			i++;
		}
		NumberOfCharacters = statement.length() - count;
		return NumberOfCharacters;
	}
}
