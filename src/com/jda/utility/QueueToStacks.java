package com.jda.utility;

public class QueueToStacks<T extends Comparable<T>> {
	public int stackSize;
	public Stack<T> stack1;
	public Stack<T> stack2;

	public QueueToStacks(int size) {
		this.stackSize = size;
		stack1 = new Stack<T>(this.stackSize);
		stack2 = new Stack<T>(this.stackSize);
	}

	public void enqueue(T data) {
		stack1.push(data);
	}

	public T dequeue() throws Exception {
		if (stack1.isEmpty() && stack2.isEmpty())
			return null;
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}
}