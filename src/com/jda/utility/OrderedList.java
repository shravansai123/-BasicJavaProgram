package com.jda.utility;

import com.jda.utility.LinkedListNode;

public class OrderedList<T extends Comparable<T>> {
	private LinkedListNode<T> first = null;

	public void add(LinkedListNode<T> node) {
		if (first == null) {
			node.setNext(first);
			first = node;
		} else {
			LinkedListNode<T> temp = first;
			LinkedListNode<T> prev = null;
			while (temp != null && ((temp.value).compareTo(node.value) <= 0)) {
				prev = temp;
				temp = temp.next;
			}

			if (temp == null) {
				prev.next = node;
				node.next = null;
			} else {
				if (temp == first) {
					node.next = temp;
					first = node;
				} else {
					node.next = temp;
					prev.next = node;
				}
			}
		}
	}

	public void remove(LinkedListNode<T> node) {
		if (first.getNext() != null) {
			first = first.getNext();
		} else
			first = null;
	}

	public void removeAt(T elem) {
		LinkedListNode<T> temp = first;
		LinkedListNode<T> previous = null;
		if (temp != null && temp.value == elem) {
			first = temp.getNext();
			return;
		}
		while (temp != null && temp.getValue() != elem) {
			previous = temp;
			temp = temp.getNext();
		}
		if (temp.getValue() == elem) {
			previous.next = temp.next;
		}
	}

	public void printList(LinkedListNode<T> node) {
		if (node != null) {
			System.out.println(node.getValue());
			if (node.getNext() != null) {
				printList(node.getNext());
			}
		}
	}

	public void print() {
		printList(first);
	}

	public LinkedListNode<T> search(T find) {
		LinkedListNode<T> check;
		if (first == null) {
			check = null;
		}
		LinkedListNode<T> p = first;

		do {
			if (find.compareTo(p.value) == 0) {
				check = p;
				break;
			} else {
				p = p.next;
				check = null;
			}
		} while (p != null);
		return check;
	}
}

