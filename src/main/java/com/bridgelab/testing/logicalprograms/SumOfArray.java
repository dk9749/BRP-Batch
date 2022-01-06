package com.bridgelab.testing.logicalprograms;

public class SumOfArray {
	public static void main(String[] args) {
		int[] a = new int[] { 10, 20, 30, 4, 5 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			temp = temp + a[i];
		}
		System.out.println(temp);
	}
}
