/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = new String[] {"King", "Queen", "Jack"};
		String[] suit =  new String[] {"Clubs", "Clubs", "Diamonds"};
		int[] pointVal =  new int[] {13, 33, 9};

		Deck snazzy = new Deck(ranks, suit, pointVal);

		System.out.println(snazzy.isEmpty());
		System.out.println(snazzy.size());
		System.out.println(snazzy.deal());
		System.out.println(snazzy);

	}
}
