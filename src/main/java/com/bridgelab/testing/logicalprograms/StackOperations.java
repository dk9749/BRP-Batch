package com.bridgelab.testing.logicalprograms;

public class StackOperations {
	private class Node {
		int data;
		Node link;
	}

	Node top;

	@SuppressWarnings("unused")
	public void push(int x) {
		Node node = new Node();
		if (node == null) {
			System.out.println("Heap Overflow");
			return;
		}
		node.data = x;
		node.link = top;
		top = node;
	}

	public void pop() {
		if (top == null) {
			System.out.println("Stack Overflow");
			return;
		}
		top = top.link;
	}

	public int peak() {
		if (top != null) {
			return top.data;
		} else {
			System.out.println("Stack Is Empty");
			return -1;
		}
	}

	public void display() {
		if (top == null) {
			System.out.println("Heap Overflow");
		} else {
			Node node = top;
			while (node != null) {
				System.out.print(" => " + node.data);
				node = node.link;
			}
		}
	}
}
