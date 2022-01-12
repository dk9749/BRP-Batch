package com.bridgelab.testing.logicalprograms;

import java.util.Scanner;

public class TemperaturConversion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter:-\n1. For Temperatur Conversion Of Celsius to Fahrenheit."
				+ "\n2. For Temperatur Conversion Of Fahrenheit to Celsius. ");
		int choice = scanner.nextInt();
		menu(choice);
		scanner.close();
	}

	private static void menu(int choice) {
		Scanner scanner = new Scanner(System.in);
		switch (choice) {
		case 1:
			System.out.println("Enter Temperature in Celsius: ");
			int celsius = scanner.nextInt();
			System.out.println(celsiusToFahrenheit(celsius));
			break;
		case 2:
			System.out.println("Enter Temperature in Fahrenheit: ");
			int fahrenheit = scanner.nextInt();
			System.out.println(fahrenheitToCelsius(fahrenheit));
			break;
		default:
			System.out.println("Invalid Choice !!");
		}
		scanner.close();
	}

	private static double fahrenheitToCelsius(int fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}

	private static double celsiusToFahrenheit(int celsius) {
		return (celsius * 9 / 5) + 32;
	}
}
