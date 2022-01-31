package com.bridgelab.testing.logicalprograms;

import java.util.Scanner;

public class VowelConsonantCount {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Statement: ");
		String statement = scanner.nextLine();
		countVowelconsonant(statement);
		scanner.close();
	}

	private static void countVowelconsonant(String statement) {
		int vCount = 0, sCount = 0, cCount;
		for (int i = 0; i < statement.length(); i++) {
			if (isVowel(statement.charAt(i))) {
				vCount++;
			}
			if (statement.charAt(i) == ' ') {
				sCount++;
			}
		}
		cCount = statement.length() - vCount - sCount;
		System.out.println("Vowel Count: " + vCount + "\nConsonant Count: " + cCount);
	}

	private static boolean isVowel(char c) {
		c = Character.toLowerCase(c);
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}
}
