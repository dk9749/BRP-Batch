package com.bridgelab.testing.logicalprograms;

public class PrimeNumber {
	public static void main(String[] args) {
		int number = 61, temp = 0, i;
		for (i = 2; i < number; i++) {
			if (number % i == 0) {
				temp++;
			}
		}
		if (temp > 0) {
			System.out.println("Not Prime");
		} else {
			System.out.println("Prime");
		}
	}
}
