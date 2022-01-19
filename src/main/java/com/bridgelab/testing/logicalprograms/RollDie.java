package com.bridgelab.testing.logicalprograms;

import java.util.Scanner;

public class RollDie {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter How Many Times You Want To Roll: ");
		int roll = scanner.nextInt();
		rollDie(roll);
		scanner.close();
	}

	private static void rollDie(int roll) {
		int[] a = new int[roll];
		for (int i = 0; i < roll; i++) {
			a[i] = (int) Math.floor(Math.random() * 10 % 6 + 1);
		}
		sort(a);
		for (int b : a) {
			System.out.println(b);
		}
		System.out.println("-------------");
		int count = 1, maximumCount = 1, maximumCountedElement = a[0], currentElement = a[0];
		for (int i = 1; i < a.length; i++) {
			if (currentElement == a[i]) {
				count++;
			} else {
				if (count > maximumCount) {
					maximumCount = count;
					maximumCountedElement = currentElement;
				}
				currentElement = a[i];
				count = 1;
			}
		}
		System.out.println("The Die Number Which have Fallen Maximum Times Is: " + maximumCountedElement);
	}

	private static int[] sort(int[] array) {
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
}
