package com.bridgelab.testing.logicalprograms.day3;

import java.util.Scanner;

public class CarLoan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Principal Loan Amount: ");
		double p = scanner.nextDouble();
		System.out.println("Enter Rate Of Interest Compounded Monthly (Percentage): ");
		double r = scanner.nextDouble();
		System.out.println("Enter Number Of Years: ");
		double y = scanner.nextDouble();
		carLoanPayment(p, r, y);
		scanner.close();
	}

	private static void carLoanPayment(double p, double r, double y) {
		double n = 12 * y;
		double r1 = r / (12 * 100);
		double payment = (p * r1) / (1 - (Math.pow((1 + r1), (-n))));
		System.out.println("Payment Per Month Should Be: Rs." + payment);
	}
}
