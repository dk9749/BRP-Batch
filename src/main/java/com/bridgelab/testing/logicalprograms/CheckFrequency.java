package com.bridgelab.testing.logicalprograms;

public class CheckFrequency {
	public static void main(String[] args) {
		int[] array1 = new int[] { 1, 2, 8, 3, 2, 2, 2, 5, 1 };
		int[] array2 = new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			int count = 1;
			for (int j = i + 1; j < array1.length; j++) {
				if (array1[i] == array1[j]) {
					count++;
					array2[j] = -1;// ----------------------------(visited=-1 ==> to avoid counting same elements)
				}
			}
			if (array2[i] != -1) {
				array2[i] = count;
			}
		}
		System.out.println("--------------------");
		System.out.println("Elements | Frequency");
		System.out.println("--------------------");
		for (int i = 0; i < array2.length; i++) {
			if (array2[i] != -1) {
				System.out.println("    " + array1[i] + "    |     " + array2[i] + "    ");
			}
		}
		System.out.println("--------------------");
	}
}
