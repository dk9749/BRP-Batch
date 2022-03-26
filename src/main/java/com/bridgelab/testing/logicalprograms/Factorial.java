package com.bridgelab.testing.logicalprograms;

//Expression:- 1 - 1/2! - 1/3! - 1/4! ...........-1/n! 
//input n = 4
//output = 0.29133
public class Factorial {
	public static void main(String[] args) {
		int n = UtilScanner.getInt("Enter number: ");
		double result = 0, finalResult = 1;
		for (int i = 2; i <= n; i++) {
			result += 1 / factorial(i);
		}
		finalResult -= result;
		System.out.println(finalResult);
	}

	private static double factorial(int n) {
		double temp = n;
		for (int i = 1; i < n; i++) {
			temp = temp * i;
		}
		return temp;
	}
}
