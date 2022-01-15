package com.bridgelab.testing.logicalprograms;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Starting Number: ");
		int startingNumber = scanner.nextInt();
		System.out.println("Enter Ending Number: ");
		int endingNumber = scanner.nextInt();
		primeNumbers(startingNumber, endingNumber);
		scanner.close();
	}

	private static void primeNumbers(int startingNumber, int endingNumber) {
		for (int i = startingNumber; i <= endingNumber; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}

	private static boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
