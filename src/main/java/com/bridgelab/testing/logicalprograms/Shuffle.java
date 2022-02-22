package com.bridgelab.testing.logicalprograms;

import java.util.Scanner;

//Example: input=> is2 sentence4 This1 a3
//		   output=> This is a sentence
public class Shuffle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Statement: ");
		String statement = scanner.nextLine();
		shuffle(statement);
		scanner.close();
	}

	private static void shuffle(String string) {
		String[] array = sort(string);
		for (int i = 0; i < array.length; i++) {
			int length = array[i].length();
			array[i] = array[i].substring(0, length - 1);
		}
		for (String d : array) {
			System.out.print(d + " ");
		}
	}

	private static String[] sort(String string) {
		String[] array = string.split(" ");
		String temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (check(array[i]) > check(array[j])) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	private static int check(String string) {
		return string.charAt(string.length() - 1);
	}
}
