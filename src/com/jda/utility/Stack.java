package com.jda.utility;

public class Stack<T> {
	public int stackSize;
	public T[] stackArr;
	public int top;

	public Stack(int size) {
		this.stackSize = size;
		this.stackArr = (T[]) new Object[stackSize];
		this.top = -1;
	}

	public boolean isFull() {
		return (top == stackSize - 1);
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public void push(T entry) {
		if (this.isFull()) {
			System.out.println(("Stack is full. Increasing the capacity."));
			this.resize();
		}
		this.stackArr[++top] = entry;
	}

	private void resize() {
		T[] newStack = (T[]) new Object[this.stackSize * 2];
		for (int i = 0; i < stackSize; i++) {
			newStack[i] = this.stackArr[i];
		}
		this.stackArr = newStack;
		this.stackSize = this.stackSize * 2;
	}

	public T pop() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Stack is empty");
		}
		T entry = this.stackArr[top--];
		return entry;
	}

	public T peek() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Stack is empty.");
		}
		return stackArr[top];
	}

	public int size() {
		return this.stackSize;
	}

}
