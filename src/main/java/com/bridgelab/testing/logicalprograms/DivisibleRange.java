package com.bridgelab.testing.logicalprograms;

import java.util.Scanner;

public class DivisibleRange {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Lower limit, Upper Limit & one Number: ");
		int lower = scanner.nextInt();
		int upper = scanner.nextInt();
		int num = scanner.nextInt();
		divisibleRange(lower, upper, num);
	}

	public static void divisibleRange(int lower, int upper, int num) {
		for (int i = lower; i <= upper; i++) {
			if (i % num == 0) {
				System.out.println(i);
			}
		}
	}
}
