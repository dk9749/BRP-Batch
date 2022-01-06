package com.bridgelab.testing.logicalprograms;

public class MergeSortRemoveArray {
	public static void main(String[] args) {
		int[] a = new int[] { 4, 6, 5, 3, 9 };
		int[] b = new int[] { 2, 5, 1 };
		int[] c = sort(mergeArray(a, b));
		int len = removeDuplicateElements(c);
		for (int i = 0; i < len; i++) {
			System.out.println(c[i]);
		}
	}

	private static int[] sort(int[] c) {
		int temp;
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] > c[j]) {
					temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}
		return c;
	}

	private static int[] mergeArray(int[] a, int[] b) {
		int totalLength = a.length + b.length;
		int[] c = new int[totalLength];
		int i = 0, j = 0;
		for (i = 0; i < a.length; i++) {
			c[i] = a[i];

		}
		for (j = 0; j < b.length; j++) {
			c[a.length + j] = b[j];
		}
		return c;
	}

	private static int removeDuplicateElements(int[] c) {
		int j = 0;
		if (c.length == 0 || c.length == 1) {
			return c.length;
		}
		int[] temp = new int[c.length];
		for (int i = 0; i < c.length - 1; i++) {
			if (c[i] != c[i + 1]) {
				temp[j++] = c[i];
			}
		}
		temp[j++] = c[c.length - 1];
		for (int i = 0; i < j; i++) {
			c[i] = temp[i];
		}
		return j;
	}
}
