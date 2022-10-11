package activity9;
import java.util.List;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Collections;
/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	/**
	 * cards contains all the cards in the deck.
	 */
	private Card[] cards;

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck() {
		size = 52;
		cards = new Card[size];
		String[] listSuits = {"Hearts", "Diamonds", "Spades", "Clubs"};
		String[] listRanks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		for (int i = 0; i < size; i ++) {
			cards[i] = new Card(listRanks[(i / 4)],listSuits[i%4],1 + (i % 13));
		}
	}
	public Deck(String[] ranks, String[] suits, int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		size = Math.min(ranks.length, values.length);
		cards = new Card[size * suits.length];
		for (int i = 0; i < size; i ++) {
			for (int j = 0; j < suits.length; j++) {
				cards[suits.length * i + j] = new Card(ranks[i],suits[j],values[i]);
			}
		}
		shuffle();
	}


	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		return size;
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
		size = cards.length;
//		for (int i = 0; i < 1000; i ++) {
//			int a = (int) (Math.random() * 52);
//			int b = (int) (Math.random() * 52);
//			Card save = cards[a];
//			cards[a] = cards[b];
//			cards[b] = save;
//			
//		}
		int[] ind = new int[cards.length];
		for (int i = 0; i < ind.length; i ++) {
			ind[i] = i;
		}
		Shuffler.VALUE_COUNT = cards.length;
		ind = Shuffler.selectionShuffle(ind);
		Card[] newcards= new Card[ind.length];
		for (int i = 0; i < ind.length; i++) {
			newcards[i] = cards[ind[i]];
		}
		cards = newcards;
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		if (size < 1) {
			size = -1;
			return null;
		}
		Card s = cards[size-1];
		size-=1;
		
		return s;
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards[k];
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.length - 1; k >= size; k--) {
			rtn = rtn + cards[k];
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.length) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
