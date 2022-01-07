package com.bridgelab.testing.logicalprograms;

import java.util.Scanner;

public class SpringSeason {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Date: ");
		int date = scanner.nextInt();
		System.out.println("Enter Month: ");
		int month = scanner.nextInt();
		System.out.println(springSeason(date, month));
		scanner.close();
	}

	private static boolean springSeason(int date, int month) {
		if (month == 3) {
			if (date >= 20 && date <= 31) {
				return true;
			}
		}
		if (month == 6) {
			if (date >= 1 && date <= 20) {
				return true;
			}
		}
		if (month == 4) {
			if (date >= 1 && date <= 30) {
				return true;
			}
		}
		if (month == 5) {
			if (date >= 1 && date <= 31) {
				return true;
			}
		}
		return false;
	}
}
