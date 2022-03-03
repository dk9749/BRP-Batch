package com.bridgelab.testing.logicalprograms;

public class AddressBookMain {
	public static void main(String[] args) {
		AddressBookRepo addressBookRepo = new AddressBookRepo();
		boolean flag = true;
		while (flag) {
			int choice = UtilScanner
					.getInt("\nEnter Choice: \n1 to add\n2 to delete\n3 to update\n4 to display\n5 to exit");
			switch (choice) {
			case 1:
				addressBookRepo.add();
				break;
			case 2:
				addressBookRepo.delete();
				break;
			case 3:
				addressBookRepo.update();
				break;
			case 4:
				addressBookRepo.display();
				break;
			case 5:
				System.out.println("Exit !!");
				flag = false;
			}
		}
		UtilScanner.closeScanner();
	}
}
