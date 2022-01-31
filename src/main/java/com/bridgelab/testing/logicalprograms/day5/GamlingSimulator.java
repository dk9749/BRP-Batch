package com.bridgelab.testing.logicalprograms.day5;

import java.util.Scanner;

public class GamlingSimulator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Stake: ");
		int stake = scanner.nextInt();
		System.out.println("Enter Goal: ");
		int goal = scanner.nextInt();
		System.out.println("Enter Trail:");
		int trail = scanner.nextInt();
		gamlingSimulator(stake, goal, trail);
		scanner.close();
	}

	private static void gamlingSimulator(int stake, int goal, int trail) {
		int n = stake, random = 0;
		double wins = 0, count = 0;
		while (n < goal && n > trail) {
			random = (int) Math.floor(Math.random() * 10);
			if (random > 5) {
				wins++;
				n++;
			} else {
				n--;
			}
			count++;
		}
		System.out.println("Number Of Times Won: " + wins);
		System.out.println("Number Of Bet Made: " + count);
		double percentage = (wins / count) * 100;
		if (n >= stake) {
			System.out.println("Winning Percentage: " + percentage);
		} else {
			System.out.println("He Trails !!, "+"Winning Percentage: 0 ");
		}
	}
}
