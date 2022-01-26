package com.bridgelab.testing.logicalprograms;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountInteger {
//	Example 1:
//	Input: word = "a123bc34d8ef34" => 123, 34, 8
//	Output: 3
//	Explanation: The three different integers are "123", "34", and "8". Notice that "34" is only counted once.
//	Example 2:
//	Input: word = "leet1234code234"
//	Output: 2
//	Example 3:
//	Input: word = "a1b01c001"
//	Output: 1
//	Explanation: The three integers "1", "01", and "001" all represent the same integer because
//	the leading zeros are ignored when comparing their decimal values.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String Having Both Character And Integer");
		String string = scanner.next();
		System.out.println(string2integer(string));
		scanner.close();
	}

	private static int string2integer(String s) {
		int i = 0, j = 0;
		Set<String> set = new HashSet<String>();
		while (i < s.length()) {
			if (s.charAt(i) - '0' > 9) {
				i++;
			} else {
				j = i;
				while (s.charAt(j) - '0' <= 9) {
					j++;
					if (j == s.length()) {
						break;
					}
				}
				set.add(checkValue(s.substring(i, j)));
				i = j;
			}
		}
		return set.size();
	}

	private static String checkValue(String s) {
		int i = 0;
		while (i < s.length() && s.charAt(i) == '0') {
			i++;
		}
		return s.substring(i, s.length());
	}
}
