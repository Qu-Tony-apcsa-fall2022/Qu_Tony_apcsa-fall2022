package Unit9;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card1 = new Card("King", "Hearts", 13);
		Card card2 = new Card("Jack", "Hearts", 11);
		Card card3 = new Card("King", "Spades", 13);
		Card card4 = new Card("Jack", "Hearts", 11);
		
		System.out.println(card1.getSuit());
		System.out.println(card2);
		System.out.println(card3.getRank());
		System.out.println(card4.getPointValue());
		System.out.println(card4.matches(card2));
	}
}
