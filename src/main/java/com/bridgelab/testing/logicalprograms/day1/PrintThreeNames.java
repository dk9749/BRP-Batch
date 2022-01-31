package com.bridgelab.testing.logicalprograms.day1;

import java.util.Scanner;

public class PrintThreeNames {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Three Names one by one: ");
		String name1 = scanner.next();
		String name2 = scanner.next();
		String name3 = scanner.next();
		System.out.println("Hi " + name3 + ", " + name2 + " And " + name1);
		scanner.close();
	}
}
