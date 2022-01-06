package com.bridgelab.testing.logicalprograms;

public class Palindrome {
	public static void main(String[] args) {
//		int n = 1234321, temp = n, remainder, sum = 0;
//		while (temp > 0) {
//			remainder = temp % 10;
//			sum = (sum * 10) + remainder;
//			temp = temp / 10;
//		}
//		if(sum == n) {
//			System.out.println("Palindrome");
//		}else {
//			System.out.println("Not Palindrome");
//		}

		String original = "kanak", reverse = "";
		int length = original.length();
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		if(original.equals(reverse)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}
}
