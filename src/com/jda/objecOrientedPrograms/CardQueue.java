package com.jda.objecOrientedPrograms;

import java.util.LinkedList;
import java.util.Queue;

public class CardQueue {
	public static void main(String[] args) {

		Queue<Player> player = new LinkedList<>();
		DeckOfCards deck = new DeckOfCards();
		Cards card;
		int count;
		Player person;
		for (int i = 1; i < 5; i++) {
			person = new Player();
			player.add(person);
			count = 9;
			while (count != 0) {
				card = deck.draw();
				person.queue.enqueue(card.toString());
				count--;
			}
		}
		int k = 0;
		while (k != 4) {
			System.out.println("Player " + (k+1));
			Player pers = player.remove();
			pers.sort();
			pers.printqueue();
			k++;
		}
	}
}