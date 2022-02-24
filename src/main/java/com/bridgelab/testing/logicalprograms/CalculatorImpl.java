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

	@Override
	public double divide(double a, double b) {
		double c = a / b;
		return c;
	}

	@Override
	public double multiply(double a, double b) {
		double c = a * b;
		return c;
	}

	@Override
	public int powerValue(int a, int b) {
		int c = (int) Math.pow(a, b);
		return c;
	}
}
