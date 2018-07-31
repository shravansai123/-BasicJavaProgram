package com.jda.objecOrientedPrograms;

import java.util.ArrayList;
import java.util.Collections;

import com.jda.utility.Queue;
import com.jda.utility.QueueNode;

public class Player {
public Queue<String> queue=new Queue<String>();
ArrayList<String> list=new ArrayList<String>();

public void sort(){
	while(queue.front!=null){
	QueueNode<String> val=queue.dequeue();
	list.add(val.value);
}
Collections.sort(list);
int i=0;
while(i<list.size()){
	queue.enqueue(list.get(i));
	i++;
}
	}
public void printqueue(){
	for(int i=0;i<9;i++){
		String s=queue.dequeue().value;
		System.out.println(s);
	}
		
}

}
