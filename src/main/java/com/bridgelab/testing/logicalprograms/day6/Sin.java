package com.bridgelab.testing.logicalprograms.day6;

import java.util.Scanner;

public class Sin {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Anlge: ");
		double angle = scanner.nextInt();
		System.out.println("Enter Limit(Number) For Taylor series Expression: ");
		double limit = scanner.nextDouble();
		sin(angle, limit);
		scanner.close();
	}

	private static void sin(double angle, double limit) {
		double x = angle % (2 * Math.PI);
		int j = 0;
		double[] array = new double[(int) limit];
		for (double i = 1; i <= limit; i++) {
			if (i % 2 != 0) {
				array[j++] = Math.pow(x, i) / factorial(i);
			}
		}
		taylorSeries(array);
	}

	private static void taylorSeries(double[] array) {
		double sinX = 0, positiveValue = 0, negativeValue = 0;
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				positiveValue += array[i];
			} else {
				negativeValue += array[i];
			}
		}
		sinX = positiveValue - negativeValue;
		System.out.println("The Value Of sinX Using Taylor Series: " + sinX);
	}

	private static double factorial(double n) {
		for (double i = n - 1; i >= 1; i--) {
			n = n * i;
		}
		return n;
	}
}
