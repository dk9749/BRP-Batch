package com.bridgelab.testing.logicalprograms;

import java.util.Scanner;

public class Cos {
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
		for (double i = 0; i <= limit; i++) {
			if (i % 2 == 0) {
				array[j++] = Math.pow(x, i) / factorial(i);
			}
		}
		taylorSeries(array);
	}

	private static void taylorSeries(double[] array) {
		double cosX = 0, positiveValue = 0, negativeValue = 0;
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				positiveValue += array[i];
			} else {
				negativeValue += array[i];
			}
		}
		cosX = positiveValue - negativeValue;
		System.out.println("The Value Of cosX Using Taylor Series: " + cosX);
	}

	private static double factorial(double n) {
		if (n == 0.0) {
			return 1.0;
		}
		for (double i = n - 1; i >= 1; i--) {
			n = n * i;
		}
		return n;
	}
}
