package com.jda.utility;

public class Queue<T extends Comparable<T>> {
	public QueueNode<T> front = null;
	public QueueNode<T> rear = null;

	public Queue() {
		rear = front = null;
	}

	public void enqueue(T data, String purpose) {
		QueueNode<T> newnode = new QueueNode<T>(data, purpose);
		if (rear == null) {
			rear = front = newnode;
			return;
		}
		rear.next = newnode;
		rear = newnode;
	}

	public void enqueue(T data) {
		QueueNode<T> newnode = new QueueNode<T>(data);
		if (rear == null) {
			rear = front = newnode;
			return;
		}
		rear.next = newnode;
		rear = newnode;
	}

	public QueueNode<T> dequeue() {
		if (front == null)
			return null;
		QueueNode<T> temp = front;
		front = front.next;
		if (front == null)
			rear = null;
		return temp;
	}
}
