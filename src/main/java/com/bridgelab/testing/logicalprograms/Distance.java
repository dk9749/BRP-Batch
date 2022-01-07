package com.bridgelab.testing.logicalprograms;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Value Of x: ");
		double x = scanner.nextDouble();
		System.out.println("Enter The Value Of y: ");
		double y = scanner.nextDouble();
		distance(x, y);
		scanner.close();
	}

	private static void distance(double x, double y) {
		double distance = Math.sqrt(Math.pow(x, x) + Math.pow(y, y));
		System.out.println("The Euclidean Distance Is: " + distance);
	}
}
