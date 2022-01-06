package com.bridgelab.testing.logicalprograms;

import java.util.Scanner;

//Further the Leap Year
//is a Year divisible by 4 and not 100 unless it is divisible by 400. For e.g. 1800 is
//not a Leap Year and 2000 is a Leap Year.

public class LeapYear {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Year: ");
		int year = scanner.nextInt();
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("yesss!!");
		} else {
			System.out.println("Nooo!!");
		}
		scanner.close();
	}
}
