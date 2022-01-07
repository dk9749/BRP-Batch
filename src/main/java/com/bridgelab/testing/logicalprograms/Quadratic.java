package com.bridgelab.testing.logicalprograms;

import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Value Of a: ");
		double a = scanner.nextDouble();
		System.out.println("Enter Value Of b: ");
		double b = scanner.nextDouble();
		System.out.println("Enter Value Of c: ");
		double c = scanner.nextDouble();
		roots(a, b, c);
		scanner.close();
	}

	private static void roots(double a, double b, double c) {
		double delta = b * b - 4 * a * c;
		if (delta >= 0) {
			double root1 = (-b + Math.sqrt(delta)) / (2 * a);
			double root2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("Roots Of The Equation are: " + root1 + " And " + root2);
		} else {
			System.out.println("Invalid Input !!\nPlease Enter Valid Values For a, b & c");
		}
	}
}
