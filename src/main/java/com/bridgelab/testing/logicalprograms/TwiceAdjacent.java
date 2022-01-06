package com.bridgelab.testing.logicalprograms;

import java.util.Scanner;

public class TwiceAdjacent {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[5];
		System.out.println("Enter Five Numer to Continue: ");
		for (int i = 0; i < 5; i++) {
			array[i] = scanner.nextInt();
		}
		twiceOfAdjacent(array);
	}

	public static void twiceOfAdjacent(int[] array) {
		for (int i = 0; i < 4; i++) {
			if (array[i + 1] == 2 * array[i]) {
				System.out.println(array[i + 1]);
			}
		}
	}
}
