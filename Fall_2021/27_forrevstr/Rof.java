/*
Impressment Officers: Courtney Huang, Yuki Feng, Lea Kwok
APCS
HW 27: FOR the Love of Strings
2021 10 29
Time spent: 1 hr
*/

/*
QCC:
DISCO:
- substring can either have substring(beginIndex) or substring(beginIndex,endIndex)
- the latter can be used to reference a section of the string from endIndex - beginIndex. endIndex is non inclusive.
  - example: substring(4,8) only return from index 4 to 7 -> 4 characters seen -> "hamburger" = s, s.substring(4,8) -> "urge"
*/
public class Rof {

	public static void main (String [] args) {
		System.out.println(fenceF(1));
		System.out.println(fenceF(2));
		System.out.println(fenceF(3));

    System.out.println(reverseF("stressed"));
		System.out.println(reverseF("warts"));
		System.out.println(reverseF("live"));

    System.out.println(reverseR("evil"));
		System.out.println(reverseR("straw"));
		System.out.println(reverseR("desserts"));
		/*
		// basic example of a while loop converted into a for loop:
			int x = 0;
			while (x < 4) {
				System.out.println( x);
				x++;
			}

			for (int i = 0; i <4; i++) {
			System.out.println(i);
			}
			*/
		}

	// takes non-negative integer posts, returns a String representation of a fence with the specified number of posts. Uses a FOR loop.
	public static String fenceF (int posts){
		String fence = "";
		for (int x = 0; x < posts; x++){
			if (x == 0) fence += "|";
			else fence += "--|";
		}
		return fence;
	}

	// a non-empty String s and returns s with its letters reversed. Uses a FOR loop.
	public static String reverseF (String s) {
		String reverse = "";
		for (int length = s.length(); length > 0; length--) {
		  reverse += s.substring(length-1, length);
		}
		return reverse;
	 }

   // a non-empty String s and returns s with its letters reversed. Employs recursion.
   public static String reverseR (String s) {
     if (s.length() > 1) {
       return reverseR(s.substring(1)) + s.substring(0,1);
      }
      return s;
  }
}
