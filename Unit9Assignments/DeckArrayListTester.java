package Unit9;
/**
 * This is a class that tests the Deck class.
 */
public class DeckArrayListTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		DeckArrayList freshDeck = new DeckArrayList();
		DeckArrayList freshDeck2 = new DeckArrayList();
		DeckArrayList smallDeck = new DeckArrayList(new String[]{"King", "Ace", "Jack"}, new String[] {"Hearts", "Spades", "Hearts"}, new int[] {13,1,11});
		System.out.println(smallDeck);
		smallDeck.deal();
		System.out.println(smallDeck);
		smallDeck.deal();
		smallDeck.deal();
		System.out.println(smallDeck.isEmpty());
		System.out.println(freshDeck);
		freshDeck.shuffle();
		System.out.println(freshDeck);
		
	}
}
