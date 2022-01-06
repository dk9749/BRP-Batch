package com.bridgelab.testing.logicalprograms;

public class CopyArray {
	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4, 5 };
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		for (int c : b) {
			System.out.println(c);
		}
	}
}
