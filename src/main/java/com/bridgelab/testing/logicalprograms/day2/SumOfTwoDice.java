package com.bridgelab.testing.logicalprograms.day2;

public class SumOfTwoDice {
	public static void main(String[] args) {
		sum();
	}

	private static void sum() {
		double a = Math.floor(Math.random()*10)%6+1;
		double b = Math.floor(Math.random()*10)%6+1;

		System.out.println("Value Of a Is: " + a);
		System.out.println("Value Of b Is: " + b);
		System.out.print("Sum Of Two Dice Is = ");
		System.out.print(a + b);
	}
}
