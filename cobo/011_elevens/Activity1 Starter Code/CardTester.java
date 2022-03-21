/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		
		Card meep = new Card("King", "Diamonds", 13);

		System.out.println("suit: " + meep.suit());
		System.out.println("rank: " + meep.rank());
		System.out.println("pointVal: " + meep.pointValue());


		Card beep = new Card("Queen", "clubs", 12);

		System.out.println("suit: " + beep.suit());
		System.out.println("rank: " + beep.rank());
		System.out.println("pointVal: " + beep.pointValue());


		Card sleep = new Card("Ace", "hearts", 0);

		System.out.println("suit: " + sleep.suit());
		System.out.println("rank: " + sleep.rank());
		System.out.println("pointVal: " + sleep.pointValue());
	}
}
