package com.bridgelab.testing.logicalprograms;

import java.util.Scanner;

public class DistinctCharacterCount {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Word");
		String word = scanner.next();
		distinctCharacterCount(word);
		scanner.close();
	}

	private static void distinctCharacterCount(String word) {
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < word.length(); j++) {
				if (word.charAt(i) == word.charAt(j)) {
					count++;
				}
			}
			System.out.println("Alphabet- " + word.charAt(i) + " & its Count: " + count);
			count = 0;
		}
	}
}
