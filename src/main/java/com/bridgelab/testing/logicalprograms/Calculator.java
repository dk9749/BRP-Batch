package com.bridgelab.testing.logicalprograms;

import java.util.Scanner;

public class Calculator {
	static Scanner scanner = new Scanner(System.in);
	ICalculator calculator = new CalculatorImpl();

	public void add() {
		System.out.println("Enter Two Integer one by one: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println("Sum Value: " + calculator.sum(a, b));
	}

	public void subtract() {
		System.out.println("Enter Two Integer one by one: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println("Subtraction Value: " + calculator.subtraction(a, b));
	}
}
