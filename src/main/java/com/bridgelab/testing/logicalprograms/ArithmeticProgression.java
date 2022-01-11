package com.bridgelab.testing.logicalprograms;

import java.util.Scanner;

public class ArithmeticProgression {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Three Numbers One By One: ");
		int[] array = new int[3];
		for (int i = 0; i < 3; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println(arithmeticProgression(array));
		scanner.close();
	}

	private static boolean arithmeticProgression(int[] array) {
		int count = 0;
		int[] temp = new int[3];
		temp = sort(array);
		int difference = temp[1] - temp[0];
		for (int i = 0; i < temp.length; i++) {
			for (int j = i + 1; j < temp.length; j++) {
				if (temp[j] - temp[i] == difference) {
					count++;
				}
			}
		}
		if (count == 2) {
			return true;
		} else {
			return false;
		}
	}

	private static int[] sort(int[] array) {
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
}
