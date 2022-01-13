package com.bridgelab.testing.logicalprograms;

import java.util.Scanner;

public class Sqrt {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number: ");
		double c = scanner.nextInt();
		sqrt(c);
		scanner.close();
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
