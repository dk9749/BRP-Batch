package com.bridgelab.testing.logicalprograms.day5;

public class FlipCoin {
	public static void main(String[] args) {
		flipCoin();
	}

	private static void flipCoin() {
		double hCount = 0;
		double tCount = 0;
		for (int i = 0; i < 5; i++) {
			double random = Math.random();
			if (random > 0.5) {
				System.out.println("Heads");
				hCount++;
			} else {
				System.out.println("Tails");
				tCount++;
			}
		}
		double hPercentage = hCount / 5 * 100;
		double tPercentage = tCount / 5 * 100;
		System.out.println("Percentage Of Head: " + hPercentage);
		System.out.println("Percentage Of Tail: " + tPercentage);
	}
}
