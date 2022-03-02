package com.bridgelab.testing.logicalprograms;

public class Permutations {
	public static void main(String[] args) {
		String str = UtilScanner.getString("Enter word: ");
		System.out.println("All the permutations of the string are: ");
//		generatePermutation(str, 0, str.length());
		permutation(str, "");
	}

	private static void generatePermutation(String s, int start, int end) {
		if (start == end - 1) {
			System.out.println(s);
		} else {
			for (int i = start; i < end; i++) {
				s = swapString(s, start, i);
				generatePermutation(s, start + 1, end);
				s = swapString(s, start, i);
			}
		}
	}

	private static void permutation(String s, String answer) {
		if (s.length() == 0) {
			System.out.println(answer + " ");
		}
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			String leftSubString = s.substring(0, i);
			String rightSubString = s.substring(i + 1);
			String rest = leftSubString + rightSubString;
			permutation(rest, answer + ch);
		}
	}

	private static String swapString(String s, int i, int j) {
		char[] a = s.toCharArray();
		char temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		return String.valueOf(a);
	}
}