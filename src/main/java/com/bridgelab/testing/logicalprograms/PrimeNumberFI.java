package com.bridgelab.testing.logicalprograms;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberFI {
	public static void main(String[] args) {
		IPrimeNumber iPrimeNumber = (a) -> {
			for (int i = 2; i < a / 2; i++) {
				if (a % i == 0) {
					return 0;
				}
			}
			return a;
		};
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 100; i++) {
			if (iPrimeNumber.isPrime(i) != 0) {
				list.add(i);
			}
		}
		for (int a : list) {
			System.out.println(a);
		}
	}
}
