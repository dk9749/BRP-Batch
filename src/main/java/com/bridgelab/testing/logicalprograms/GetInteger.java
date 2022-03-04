package com.bridgelab.testing.logicalprograms;

import java.util.Scanner;

//Given an array nums containing n distinct numbers in the range [0, n],
//return the only number in the range that is missing from the array.
//Example 1:
//Input: nums = [3,0,1], n=3
//Output: 2
//Explanation: all numbers are in the range [0,3]. 2 is the missing number
//in the range since it does not appear in nums.
//Example 2:
//Input: nums = [0,1], n=2
//Output: 2
//Explanation: all numbers are in the range [0,2]. 2 is the missing number 
//in the range since it does not appear in nums.
//Example 3:
//Input: nums = [9,6,4,2,3,5,7,0,1], n=9
//Output: 8
//Explanation:all numbers are in the range [0,9]. 8 is the missing number 
//in the range since it does not appear in nums.
public class GetInteger {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Maximum value of array: ");
		int maxValue = scanner.nextInt();
		int[] array = new int[maxValue];
		System.out.println("Enter element one bye one: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println("Missing Element is: " + getInteger(array, maxValue));
		scanner.close();
	}

	private static int getInteger(int[] array, int maxValue) {
		int[] temp = new int[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		temp[array.length] = maxValue + 1;
		sort(temp);
		for (int i = 0; i <= maxValue; i++) {
			if (i != temp[i]) {
				return i;
			}
		}
		return -1;
	}

	private static int[] sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
}
