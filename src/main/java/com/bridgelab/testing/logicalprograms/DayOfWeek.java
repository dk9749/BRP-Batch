package com.bridgelab.testing.logicalprograms;

import java.util.Scanner;

public class DayOfWeek {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Date: ");
		int date = scanner.nextInt();
		System.out.println("Enter Month: ");
		int month = scanner.nextInt();
		System.out.println("Enter Year: ");
		int year = scanner.nextInt();
		dayOfWeek(date, month, year);
		scanner.close();
	}

	private static void dayOfWeek(int date, int month, int year) {
		int y = year - ((14 - month) / 12);
		int x = y + (y / 4) - (y / 100) + (y / 400);
		int m = month + (12 * ((14 - month) / 12)) - 2;
		int d = (date + x + ((31 * m) / 12)) % 7;
		switch (d) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		}
	}
}
