package com.bridgelab.testing.logicalprograms;

import java.util.Scanner;

public class Truncate {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Statement: ");
		String statement = scanner.nextLine();
		System.out.println("Enter An Integer: ");
		int k = scanner.nextInt();
		for (String s : truncate(statement, k)) {
			System.out.print(s + " ");
		}
		scanner.close();
	}

	private static String[] truncate(String statement, int k) {
		String[] array = statement.split(" ");
		String[] temp = new String[k];
		for (int i = 0; i < k; i++) {
			temp[i] = array[i];
		}
		return temp;
	}
}
