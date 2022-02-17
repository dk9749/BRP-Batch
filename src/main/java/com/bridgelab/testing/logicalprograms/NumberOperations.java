package com.bridgelab.testing.logicalprograms;

import java.util.Scanner;

public class NumberOperations {
	public static void main(String[] args) {
		boolean flag = true;
		Scanner scanner = new Scanner(System.in);
		Calculator calculator = new Calculator();
		while (flag) {
			System.out.println("Enter\n1 to add\n2 to subtract\n3 to exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				calculator.add();
				break;
			case 2:
				calculator.subtract();
				break;
			case 3:
				System.out.println("Exit !!");
				flag = false;
			}
		}
		scanner.close();
	}
}
