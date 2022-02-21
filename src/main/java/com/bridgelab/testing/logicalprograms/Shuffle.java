package com.bridgelab.testing.logicalprograms;

public class Shuffle {
	public static void main(String[] args) {
//	Scanner scanner = new Scanner(System.in);
//	System.out.println("Enter Statement: ");
//	String statement = scanner.nextLine();
		shuffle("is2 sentence4 This1 a3");
//	scanner.close();
	}

	private static void shuffle(String s) {
		String[] a = sort(s);
		for (int i = 0; i < a.length; i++) {
			int length = a[i].length();
			a[i] = a[i].substring(0, length - 1);
		}
		for (String d : a) {
			System.out.print(d + " ");
		}
	}

	private static String[] sort(String s) {
		String[] a = s.split(" ");
		String temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (check(a[i]) > check(a[j])) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}

	private static int check(String s) {
		return s.charAt(s.length() - 1);
	}
}
