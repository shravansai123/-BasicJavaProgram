package com.jda.objecOrientedPrograms;

import java.util.Random;

public class DeckOfCards {
	public Cards[] cards;
	int noOfCards;

	DeckOfCards() {
		noOfCards = 51;
		cards = new Cards[52];
		int x = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				cards[x] = new Cards(i, j);
				x++;
			}
		}
	}
	public Cards draw() {
		Random generator = new Random();
		int index=0;
		do{
			index=generator.nextInt(52);
		}
		while(cards[index]==null);
		Cards temp=cards[index];
		cards[index]=null;
		return temp;			
	}

}
