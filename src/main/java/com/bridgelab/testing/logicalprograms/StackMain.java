package com.bridgelab.testing.logicalprograms;

public class StackMain {
	public static void main(String[] args) {
		StackOperations list = new StackOperations();
		list.push(1);
		list.push(2);
		list.push(3);
		System.out.println("After Pushing Element");
		list.display();
		System.out.println();
		System.out.println("Peak Element In The Stack Is: " + list.peak());
		list.pop();
		System.out.println("After Popping Element");
		list.display();
	}
}
