package com.bridgelab.testing.logicalprograms;

import java.util.Scanner;

public class NumberOperations {
	public static void main(String[] args) {
		boolean flag = true;
		Scanner scanner = new Scanner(System.in);
		Calculator calculator = new Calculator();
		while (flag) {
			System.out.println(
					"\n-------------Wlecome To Calculator-------------\n\nEnter\n1 to add\n2 to subtract\n3 to divide\n4 to multiply\n5 to power value\n6 to exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				calculator.add();
				break;
			case 2:
				calculator.subtract();
				break;
			case 3:
				calculator.divide();
				break;
			case 4:
				calculator.multiply();
				break;
			case 5:
				calculator.powerValue();
				break;
			case 6:
				System.out.println("Exit !!");
				flag = false;
			}
		}
		scanner.close();
	}
}
