package com.bridgelab.testing.logicalprograms.day4;

import java.util.Scanner;

public class HarmonicNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number: ");
		double number = scanner.nextInt();
		System.out.println(harmonicNumber(number));
		scanner.close();
	}

	private static double harmonicNumber(double number) {
		double harmonicNumber = 0;
		for (double i = 1; i <= number; i++) {
			harmonicNumber += (1 / i);
		}
		return harmonicNumber;
	}
}
