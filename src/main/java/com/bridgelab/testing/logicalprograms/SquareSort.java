package com.bridgelab.testing.logicalprograms;

import java.util.Scanner;

public class SquareSort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int[] array = new int[3];
		for (int i = 0; i < 3; i++) {
			array[i] = scanner.nextInt();
		}
		squareAndSort(array);
		for (int j = 0; j < 3; j++) {
			System.out.println(array[j]);
		}
		scanner.close();
	}

	public static int[] squareAndSort(int[] array) {
		for (int i = 0; i < 3; i++) {
			array[i] = array[i] * array[i];
		}
		for (int j = 0; j < 3; j++) {
			for (int k = j + 1; k < 3; k++) {
				int tmp = 0;
				if (array[j] > array[k]) {
					tmp = array[j];
					array[j] = array[k];
					array[k] = tmp;
				}
			}
		}
		return array;
	}
}
