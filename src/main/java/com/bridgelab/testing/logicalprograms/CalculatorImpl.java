package com.bridgelab.testing.logicalprograms;

public class CalculatorImpl implements ICalculator {

	@Override
	public int sum(int a, int b) {
		int c = a + b;
		return c;
	}

	@Override
	public int subtraction(int a, int b) {
		int c = a - b;
		return c;
	}
}
