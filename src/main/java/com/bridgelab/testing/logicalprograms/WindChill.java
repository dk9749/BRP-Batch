package com.bridgelab.testing.logicalprograms;

import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Temperature: ");
		double t = scanner.nextDouble();
		System.out.println("Enter Velocity: ");
		double v = scanner.nextDouble();
		if (t >= 50 && v >= 120 && v <= 3) {
			System.out.println("Please Enter Valid Values !!");
		} else {
			windChill(t, v);
		}
		scanner.close();
	}

	private static void windChill(double t, double v) {
		double w = 35.74 + (0.6215 * t) + (((0.4275 * t) - 35.75) * Math.pow(v, 0.16));
		System.out.println("The Effective Temperature is: " + w);
	}
}
