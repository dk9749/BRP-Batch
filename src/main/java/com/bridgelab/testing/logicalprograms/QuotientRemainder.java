package com.bridgelab.testing.logicalprograms;

import java.util.Scanner;

public class QuotientRemainder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter divident: ");
		int divident = scanner.nextInt();
		System.out.println("Enter divisor");
		int divisor = scanner.nextInt();
		quotientRemainder(divident, divisor);
		scanner.close();
	}

	private static void quotientRemainder(int divident, int divisor) {
		int quotient = divident / divisor;
		int remainder = divident % divisor;
		if (remainder > divisor / 2) {
			remainder = 0;
			quotient = quotient + 1;
			System.out.println("Quotient: " + quotient + ", Remainder: " + remainder);
		} else {
			System.out.println("Quotient: " + quotient + ", Remainder: " + remainder);
		}
	}
}
