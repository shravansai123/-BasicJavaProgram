package com.jda.utility;

public class Queue<T> {
	private int capacity;
	T queueArr[];
	int front = 0;
	int rear = -1;
	int currentSize = 0;

	public Queue(int queueSize) {
		this.capacity = queueSize;
		queueArr = (T[]) new Object[this.capacity];
	}

	public void enqueue(T item) {
		rear++;
		if (rear == capacity - 1) {
			rear = 0;
		}
		queueArr[rear] = item;
		currentSize++;
	}

	public void dequeue() {
		front++;
		if (front == capacity - 1) {
			front = 0;
		}
		currentSize--;
	}

	public boolean isEmpty() {
		boolean status = false;
		if (currentSize == 0) {
			status = true;
		}
		return status;
	}
	public int currentSize() {
		return currentSize;
	}
}
