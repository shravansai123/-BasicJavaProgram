package com.jda.objecOrientedPrograms;

public class CardGame {
	public static void main(String[] args){
	DeckOfCards deck=new DeckOfCards();
	Cards card;
	int count;
	for(int i=1;i<5;i++){
		count=9;
		System.out.println("cards for palayer "+i);		
		while(count!=0){
			card=deck.draw();
			System.out.println(card);
			count--;
		}
	}
}
}
