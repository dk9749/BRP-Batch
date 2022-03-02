package com.bridgelab.testing.logicalprograms;

import java.util.Scanner;

public class BankAtm {
	int userBalance = 10000;
	int atmBalance = 100000;
	int count = 0;

	public static void main(String[] args) {
		BankAtm atm = new BankAtm();
		boolean flag = true;
		Scanner scanner = new Scanner(System.in);
		while (flag) {
			System.out.println(
					"\n------Welcome to Bank ATM------\n\nEnter Choice: \n1. Add money\n2. Withdraw money\n3. Display User Balance\n4. Display Atm Balance\n5. Exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Amount to Add: ");
				int amount = scanner.nextInt();
				atm.add(amount);
				break;
			case 2:
				System.out.println("Enter Amount to withdraw: ");
				amount = scanner.nextInt();
				atm.withdraw(amount);
				break;
			case 3:
				atm.userBalance();
				break;
			case 4:
				atm.atmBalance();
				break;
			case 5:
				System.out.println("Thank You For Visiting Our Bank ATM !!");
				flag = false;
			}
		}
		scanner.close();
	}

	private void atmBalance() {
		System.out.println("ATM Balance: " + atmBalance);
	}

	private void userBalance() {
		System.out.println("User Account Balance: " + userBalance);
	}

	private void withdraw(int amount) {
		if (amount > 5000) {
			System.out.println("Sorry !! You can only withdraw 5000 in once.");
			return;
		}
		if (atmBalance >= amount && userBalance >= amount) {
			userBalance -= amount;
			atmBalance -= amount;
			count++;
			if (count > 3) {
				System.out.println("Today's Limit Exceeded !!");
				userBalance += amount;
				atmBalance += amount;
				return;
			}
			System.out.println("Transaction successfull");
		} else {
			System.out.println("Insufficient Balance !!");
		}
	}

	private void add(int amount) {
		if (amount > 5000) {
			System.out.println("Sorry !! You can only add 5000 in once.");
			return;
		} else {
			userBalance += amount;
			atmBalance += amount;
			if (userBalance > 25000) {
				System.out.println("Balance Limit Exceeded !!");
				userBalance -= amount;
				atmBalance -= amount;
			} else {
				System.out.println("Transaction successfull");
			}
		}
	}
}
