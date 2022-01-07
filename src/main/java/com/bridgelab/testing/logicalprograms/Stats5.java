package com.bridgelab.testing.logicalprograms;

import java.util.Arrays;

public class Stats5 {
	public static void main(String[] args) {
		stats5();
	}

	private static void stats5() {
		double a, b, c, d, e, temp;
		a = Math.random();
		b = Math.random();
		c = Math.random();
		d = Math.random();
		e = Math.random();
		System.out.println("Five Random Values are:\n" + a + ", " + b + ", " + c + ", " + d + ", " + e);
		double average = (a + b + c + d + e) / 5;
		double[] array = new double[] { a, b, c, d, e };
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("Average = " + average);
		System.out.println("Minimum Value Is: " + array[0]);
		System.out.println("Maximum Value Is: " + array[array.length - 1]);
	}
}
