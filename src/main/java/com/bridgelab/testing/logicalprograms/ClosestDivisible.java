package com.bridgelab.testing.logicalprograms;

import java.util.Scanner;

public class ClosestDivisible {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number And Target: ");
		int num = scanner.nextInt();
		int target = scanner.nextInt();
		closestDivisible(num, target);
		scanner.close();
	}

//Example 1 :
//	Number => 42
//	Target => 5
//	Output => 40
//
//	Example 2 :
//	Number => 50
//	Target => 2
//	Output => True
	public static void closestDivisible(int num, int target) {
		int number = 0;
		if (num % target == 0) {
			System.out.println("true");
		} else {
			for (int i = target; i < num; i++) {
				if (i % target == 0) {
					number = i;
				}
			}
			System.out.println(number);
		}
	}
}
