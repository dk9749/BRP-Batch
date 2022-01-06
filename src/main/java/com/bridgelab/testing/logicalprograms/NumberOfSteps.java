package com.bridgelab.testing.logicalprograms;

import java.util.Scanner;

public class NumberOfSteps {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int number = scanner.nextInt();
		System.out.println(numberOfSteps(number));
		scanner.close();
	}

	private static int numberOfSteps(int number) {
		int count = 0;
		while (number > 0) {
			if (number % 2 == 0) {
				number = number / 2;
			} else {
				number = number - 1;
			}
			count++;
		}
		return count;
	}
}
