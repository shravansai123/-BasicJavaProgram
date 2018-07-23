package com.jda.utility;

public class QueueNode<T> {
	public T value;
	public QueueNode<T> next;
	public String purpose = null;

	QueueNode(T data, String pur) {
		value = data;
		purpose = pur;
		next = null;
	}
	QueueNode(T data) {
		value = data;
		next = null;
	}
	
}
