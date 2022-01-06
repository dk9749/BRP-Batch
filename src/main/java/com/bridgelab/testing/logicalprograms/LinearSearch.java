package com.bridgelab.testing.logicalprograms;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		int[] a = new int[] { 10, 20, 30, 40, 50 };
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number To Search: ");
		int n = scanner.nextInt();
		System.out.println(linearSort(a, n));
	}

	private static int linearSort(int[] a, int n) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==n) {
				return i;
			}
		}
		return -1;
	}
}
