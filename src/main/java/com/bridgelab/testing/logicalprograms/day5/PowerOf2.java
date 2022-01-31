package com.bridgelab.testing.logicalprograms.day5;

import java.util.Scanner;

public class PowerOf2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int number = scanner.nextInt();
		for (int d : powerOf2(number)) {
			System.out.println(d);
		}
		scanner.close();
	}

	private static int[] powerOf2(int number) {
		int[] table = new int[number + 1];
		for (int i = 0; i <= number; i++) {
			table[i] = (int) Math.pow(2, i);
		}
		return table;
	}
}
