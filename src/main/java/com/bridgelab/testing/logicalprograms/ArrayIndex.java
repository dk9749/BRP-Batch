package com.bridgelab.testing.logicalprograms;

import java.util.Scanner;

public class ArrayIndex {
	public static void main(String[] args) {
		int[] array = { 4, 6, 3, 9, 13, 11, 10 };
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter target integer: ");
		int target = scanner.nextInt();
		System.out.println("Target index: " + getIndex(array, target));
		scanner.close();
	}

	private static int getIndex(int[] array, int target) {
		int temp[] = new int[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		temp[array.length] = target;
		sort(temp);
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] == target) {
				return i;
			}
		}
		return -1;
	}

	private static int[] sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
}
