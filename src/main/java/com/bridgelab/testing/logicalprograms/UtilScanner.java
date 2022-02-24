package com.bridgelab.testing.logicalprograms;

import java.util.Scanner;

public class UtilScanner {
	private static final Scanner SCANNER = new Scanner(System.in);

	public static int getInt(String messege, boolean closeScanner) {
		messege(messege);
		int i = SCANNER.nextInt();
		if (closeScanner) {
			SCANNER.close();
		}
		return i;
	}

	public static double getDouble(String messege, boolean closeScanner) {
		messege(messege);
		double d = SCANNER.nextDouble();
		if (closeScanner) {
			SCANNER.close();
		}
		return d;
	}

	public static String getString(String messege, boolean closeScanner) {
		messege(messege);
		String s = SCANNER.nextLine();
		if (closeScanner) {
			SCANNER.close();
		}
		return s;
	}

	public static void messege(String messege) {
		System.out.println(messege);
	}
}
