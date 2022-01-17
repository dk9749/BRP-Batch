package com.bridgelab.testing.logicalprograms;

import java.util.Scanner;

public class SortestDistance {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter A word: ");
		String word = scanner.next();
		System.out.println("Enter Character: ");
		char character = scanner.next().charAt(0);
		System.out.println(sortestDistance(word, character));
		scanner.close();
	}

	private static int sortestDistance(String word, char character) {
		word = word.toLowerCase();
		character = Character.toLowerCase(character);
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == character) {
				return i;
			}
		}
		return character;
	}
}
