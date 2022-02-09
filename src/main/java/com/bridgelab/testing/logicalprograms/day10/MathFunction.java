package com.bridgelab.testing.logicalprograms.day10;

import java.util.Scanner;

public class MathFunction {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(presentValue());
		System.out.println("Maximun Value: " + maxValue());
		System.out.println("Minimum Value: " + minValue());
		scanner.close();
	}

	private static int minValue() {
		System.out.println("Enter 5 integers one by one: ");
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		sort(array);
		return array[0];
	}

	private static void sort(int[] array) {
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	private static int maxValue() {
		System.out.println("Enter 5 integers one by one: ");
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		sort(array);
		return array[4];
	}

	private static double presentValue() {
		System.out.println("Enter interest rate: ");
		double r = scanner.nextDouble();
		System.out.println("Enter cash flow amount: ");
		double c = scanner.nextDouble();
		System.out.println("Enter time in year: ");
		double t = scanner.nextDouble();
		double pValue = c / Math.pow((1 + r), t);
		return pValue;
	}
}
