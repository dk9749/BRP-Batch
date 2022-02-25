package com.bridgelab.testing.logicalprograms;

import java.util.HashSet;
import java.util.Set;

public class NumberOfInteger {
	public static void main(String[] args) {
		System.out.println(numDifferentIntegers("leet1234code234jis1234"));
	}

	public static int numDifferentIntegers(String s) {
		Set<String> set = new HashSet<String>();
		int i = 0, j = 0;
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
				set.add(rem(s.substring(i, j)));
				i = j;
			}
		}
		return set.size();
	}

	private static String rem(String s) {
		int i = 0;
		while (i < s.length() && s.charAt(i) == '0') {
			i++;
		}
		return s.substring(i, s.length());
	}
}
