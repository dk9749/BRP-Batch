package com.bridgelab.testing.logicalprograms;

public class DuplicateElements {
	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4, 2, 7, 8, 8, 3 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}

	public static void duplicate() {
		String s = "harry";
		char[] c = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (c[i] == c[j]) {
					System.out.println(c[i]);
				}
			}
		}
	}
}
