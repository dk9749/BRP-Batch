package com.bridgelab.testing.logicalprograms.day4;

import java.util.Scanner;

public class Trig {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"Enter:-\n1. To Get Value Of Sin()" + "\n2. To Get Value Of Cos()" + "\n3. To Get Value Of Radians");
		int choice = scanner.nextInt();
		menu(choice);
		scanner.close();
	}

	private static void menu(int choice) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Angle In Degree: ");
		double angle = scanner.nextDouble();
		switch (choice) {
		case 1:
			System.out.println(Math.sin(angle));
			break;
		case 2:
			System.out.println(Math.cos(angle));
			break;
		case 3:
			System.out.println(Math.toRadians(angle));
			break;
		default:
			System.out.println("Invalid Choice !!");
		}
		scanner.close();
	}
}
