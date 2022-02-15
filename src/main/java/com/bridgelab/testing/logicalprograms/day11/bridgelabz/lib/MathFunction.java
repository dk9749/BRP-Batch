package com.bridgelab.testing.logicalprograms.day11.bridgelabz.lib;

public class MathFunction {

	private static double harmonicNumber(double number) {
		double harmonicNumber = 0;
		for (double i = 1; i <= number; i++) {
			harmonicNumber += (1 / i);
		}
		return harmonicNumber;
	}

	private static void cos(double angle, double limit) {
		double x = angle % (2 * Math.PI);
		int j = 0;
		double[] array = new double[(int) limit];
		for (double i = 0; i <= limit; i++) {
			if (i % 2 == 0) {
				array[j++] = Math.pow(x, i) / factorial(i);
			}
		}
		taylorSeries1(array);
	}

	private static void taylorSeries1(double[] array) {
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

	private static void sqrt(double c) {
		double t = c;
		double epsilon = 1e-15;
		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2;
		}
		System.out.println(t);
	}
}
