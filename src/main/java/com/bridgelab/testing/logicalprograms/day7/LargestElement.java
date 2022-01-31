package com.bridgelab.testing.logicalprograms.day7;

public class LargestElement {
	public static void main(String[] args) {
		int[] a = new int[] { 1, 0, 80, 25, 11, 7, 75, 56 };
		int temp = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > temp) {//--------------------For Smallest Change Comparison Operator (<).
				temp = a[i];
			}
		}
		System.out.println(temp);
	}
}
