package com.bridgelab.testing.logicalprograms;

import java.util.ArrayList;
import java.util.List;

public class FibonacciNumber {
	public static void main(String[] args) {
		IFibonacciNumber fibonacciNumber = (n) -> {
			List<Integer> a = new ArrayList<>();
			int next, prev = 0, current = 1, i = 2;
			a.add(0);
			a.add(1);
			while (i < n) {
				next = prev + current;
				a.add(next);
				prev = current;
				current = next;
				i++;
			}
			return a;
		};
		for (int a : fibonacciNumber.fibonacciNumber(10)) {
			System.out.println(a);
		}
	}
}
