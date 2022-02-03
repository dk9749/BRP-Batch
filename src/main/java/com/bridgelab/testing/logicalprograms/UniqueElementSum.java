package com.bridgelab.testing.logicalprograms;

import java.util.Scanner;

//Example 1:
//Input: nums = [1,2,3,2]
//Output: 4
//Explanation: The unique elements are [1,3], and the sum is 4.
//
//Example 2:
//Input: nums = [1,1,1,1,1]
//Output: 0
//Explanation: There are no unique elements, and the sum is 0.
//
//Example 3:
//Input: nums = [1,2,3,4,5]
//Output: 15
public class UniqueElementSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter Number One By One: ");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println("Sum: " + uniqueElementSum(array));
		scanner.close();
	}

	private static int uniqueElementSum(int[] array) {
		sort(array);
		int[] temp = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					temp[i] = array[i];
				}
			}
		}
		array = removeDuplicate(array);
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (!isMatch(array[i], temp)) {
				sum += array[i];
			}
		}
		return sum;
	}

	private static boolean isMatch(int n, int[] temp) {
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] == n) {
				return true;
			}
		}
		return false;
	}

	private static int[] removeDuplicate(int[] array) {
		int j = 0;
		int[] temp = new int[array.length];
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] != array[i + 1]) {
				temp[j++] = array[i];
			}
		}
		temp[j++] = array[array.length - 1];
		int[] array1 = new int[j];
		for (int i = 0; i < j; i++) {
			array1[i] = temp[i];
		}
		return array1;
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
