package com.bridgelab.testing.logicalprograms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UtilScanner {
	private static final Scanner SCANNER = new Scanner(System.in);

	public static int getInt(String messege) {
		messege(messege);
		int i = 0;
		do {
			try {
				i = SCANNER.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Incorrect Input !! please try again.");
			}
			SCANNER.nextLine();
		} while (i <= 0);
		return i;
	}

	public static long getLong(String messege) {
		messege(messege);
		long i = 0;
		do {
			try {
				i = SCANNER.nextLong();
			} catch (InputMismatchException e) {
				System.out.println("Incorrect Input !! please try again.");
			}
			SCANNER.nextLine();
		} while (i <= 0);
		return i;
	}

	public static double getDouble(String messege) {
		messege(messege);
		double i = 0;
		do {
			try {
				i = SCANNER.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Incorrect Input !! please try again.");
			}
			SCANNER.nextLine();
		} while (i <= 0);
		return i;
	}

	public static String getString(String messege) {
		messege(messege);
		return SCANNER.next();
	}

	public static void messege(String messege) {
		System.out.println(messege);
	}

	public static void closeScanner() {
		SCANNER.close();
	}
}
