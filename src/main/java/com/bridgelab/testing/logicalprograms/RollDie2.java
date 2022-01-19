package com.bridgelab.testing.logicalprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Pair1 {
	int die;
	int dieFrequency;

	public Pair1(int die, int dieFrequency) {
		super();
		this.die = die;
		this.dieFrequency = dieFrequency;
	}
}

public class RollDie2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter How Many Times You Want To Roll: ");
		int roll = scanner.nextInt();
		int[] array = new int[roll];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.floor(Math.random() * 10 % 6 + 1);
		}
		for (int b : array) {
			System.out.println(b);
		}
		System.out.println("Number Which Have Fallen Maximum Times Is: " + rollDie(array));
		scanner.close();
	}

	private static int rollDie(int[] array) {
		List<Pair1> list = new ArrayList<Pair1>();
		for (int i = 0; i < array.length; i++) {
			list.add(new Pair1(array[i], frequency(array[i], array)));
		}
		Collections.sort(list, (c, b) -> b.dieFrequency - c.dieFrequency);
		return list.get(0).die;
	}

	private static int frequency(int die, int[] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (die == array[i]) {
				count++;
			}
		}
		return count;
	}
}
