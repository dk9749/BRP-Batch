package com.bridgelab.testing.logicalprograms;

public class SecondLargest {
	public static void main(String[] args) {
		int size = UtilScanner.getInt("Enter array size: ");
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = UtilScanner.getInt("Enter element");
		}
		System.out.println("Second Largest Number: " + secondLargest(array));
	}

	private static int secondLargest(int[] array) {
		int num = 0;
		int[] temp = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if (check(array[i], array)) {
				num = array[i];
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				temp[i] = 0;
			} else {
				temp[i] = array[i];
			}
		}
		for (int i = 0; i < temp.length; i++) {
			if (check(temp[i], temp)) {
				num = temp[i];
			}
		}
		return num;
	}

	private static boolean check(int num, int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (num < array[i]) {
				return false;
			}
		}
		return true;
	}
}
