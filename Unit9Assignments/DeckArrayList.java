package Unit9;
import java.util.List;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Collections;
/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class DeckArrayList {

	/**
	 * cards contains all the cards in the deck.
	 */
	private ArrayList<Card> cards;

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
	public DeckArrayList() {
		size = 52;
		cards = new ArrayList<Card>();
		String[] listSuits = {"Hearts", "Diamonds", "Spades", "Clubs"};
		String[] listRanks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		for (int i = 0; i < size; i ++) {
			cards.add( new Card(listRanks[(i / 4)],listSuits[i%4],1 + (i % 13)));
		}
	}
	public DeckArrayList(String[] ranks, String[] suits, int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		size = Math.min(ranks.length,Math.min(suits.length, values.length));
		cards = new ArrayList<Card>();
		for (int i = 0; i < size; i ++) {
			cards.add( new Card(ranks[i],suits[i],values[i]));
		}
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
		size = cards.size();
//		for (int i = 0; i < 1000; i ++) {
//			int a = (int) (Math.random() * 52);
//			int b = (int) (Math.random() * 52);
//			Card save = cards[a];
//			cards[a] = cards[b];
//			cards[b] = save;
//			
//		}
		int[] ind = new int[cards.size()];
		for (int i = 0; i < ind.length; i ++) {
			ind[i] = i;
		}
		Shuffler.VALUE_COUNT = cards.size();
		ind = Shuffler.selectionShuffle(ind);
		ArrayList<Card> newcards= new ArrayList<Card>();
		for (int i = 0; i < ind.length; i++) {
			newcards.add(cards.get(ind[i]));
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
		Card s = cards.get(cards.size()-1);
		size-=1;
		if (size < 0) {
			size = -1;
			return new Card("empty","empty",0);
		}
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
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
