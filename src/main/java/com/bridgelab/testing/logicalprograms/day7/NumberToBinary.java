package com.bridgelab.testing.logicalprograms.day7;

import java.util.Scanner;

public class NumberToBinary {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = scanner.nextInt();
		binary(num);
		scanner.close();
	}
//	Take an integer number, convert that number into binary and print in output.
//	(Without using toBinary() or any direct method)
//
//	Example 1:
//	Input => n = 5
//	Output => 101
//
//	Example 2:
//	Input => 10
//	Output => 1010

	private static void binary(int num) {
		int[] array = new int[num];
		int count = 0;
		for (int i = 0; num > 0; i++) {
			if (num % 2 == 0) {
				array[i] = 0;
			} else {
				array[i] = 1;
			}
			num = num / 2;
			count++;
		}
		for (int i = count - 1; i >= 0; i--) {
			System.out.print(array[i]);
		}
	}
}
