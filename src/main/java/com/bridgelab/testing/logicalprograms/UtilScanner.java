package com.bridgelab.testing.logicalprograms;

import java.util.Scanner;

public class UtilScanner {
	private static final Scanner SCANNER = new Scanner(System.in);

	public static int getInt(String messege) {
		messege(messege);
		return SCANNER.nextInt();
	}

	public static double getDouble(String messege) {
		messege(messege);
		return SCANNER.nextDouble();
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
