package com.jda.dataStructurePrograms;

public class LinkedList<T> {
private LinkedListNode<T> first=null;

public void add(LinkedListNode<T> node){
	node.setNext(first);
	first=node;
}
public void remove(LinkedListNode<T> node){
	if(first.getNext()!=null){
		first=first.getNext();
	}
	else
		first=null;
		}
private void printList(LinkedListNode<T> node){
	System.out.println(node.getValue());
	if(node.getNext()!=null){
		printList(node.getNext());
	}}
	public void print(){
		printList(first);
	}

}
