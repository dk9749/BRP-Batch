package com.bridgelab.testing.logicalprograms;

public class LeftRotateArray {
	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4, 5 };
		int first, j, n = 3;//-----------------------n ==> Number After Which Rotation Happens !!
		for (int i = 0; i < n; i++) {
			first = a[0];
			for (j = 0; j < a.length - 1; j++) {
				a[j] = a[j + 1];
			}
			a[j] = first;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
