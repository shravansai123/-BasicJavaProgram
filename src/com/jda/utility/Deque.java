package com.jda.utility;

public class Deque<T> {
	LinkedListNode<T> front, rear;
	int size;

	public Deque() {
		front = null;
		rear = null;
		size = 0;
	}

	public boolean isEmpty() {
		return front == null;
	}

	public int getSize() {
		return size;
	}

	public void insertAtFront(T val) {
		LinkedListNode<T> nptr = new LinkedListNode<T>(val);
		size++;
		if (front == null) {
			front = nptr;
			rear = front;
		} else {
			nptr.setNext(front);
			front = nptr;
		}
	}

	public void insertAtRear(T val) {
		LinkedListNode<T> nptr = new LinkedListNode<T>(val);
		size++;
		if (rear == null) {
			rear = nptr;
			front = rear;
		} else {
			rear.setNext(nptr);
			rear = nptr;
		}
	}

	public T removeAtFront() {
		LinkedListNode<T> temp = front.next;
		LinkedListNode<T> value = front;
		front.setNext(null);
		front = temp;
		size--;
		return value.getValue();
	}

	public T removeAtEnd() {
		LinkedListNode<T> a = front;
		LinkedListNode<T> b = front;
		while (a != rear) {
			b = a;
			a = a.next;
		}
		rear = b;
		rear.setNext(null);
		size--;
		return a.getValue();
	}
	
}
