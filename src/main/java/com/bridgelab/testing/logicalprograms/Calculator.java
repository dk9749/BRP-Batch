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

	public void divide() {
		System.out.println("Enter Two Integer one by one: ");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		System.out.println("Division Value: " + calculator.divide(a, b));
	}

	public void multiply() {
		System.out.println("Enter Two Integer one by one: ");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		System.out.println("Multiplication Value: " + calculator.multiply(a, b));
	}

	public void powerValue() {
		System.out.println("Enter Base value And Power one by one: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println("Power Value: " + calculator.powerValue(a, b));
	}
}
