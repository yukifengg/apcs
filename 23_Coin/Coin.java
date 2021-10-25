/*
Mochi Yoshi - Yuki Feng, Courtney Huang
APCS
HW 23: What Does Equality Look Like?
2021 10 23
Time spent: 1.5 hours */
import java.util.Random;
public class Coin {

  // attributes aka instance vars
  private double value;
  private String upFace;
  private String denomination;
  private int flipCtr, headsCtr, tailsCtr;
  private double bias;

  // default contructor
  public Coin() {
  }

  /***
      Coin(String) -- overloaded constructor
      precond: input is one of
      "penny",
      "nickel",
      "dime",
      "quarter",
      "half dollar",
      "dollar"
      postcond:
  ***/
  public Coin( String s ) {
    this.denomination = s;
    //name = s;
  }


  /***
      Coin(String,String) -- 2nd overloaded contructor
      precond:
      postcond:
  ***/
  public Coin( String s, String nowFace ) {
    // this.denomination = s;
    String oldFace = upFace;
    upFace = nowFace;

  // Accessors...
  // ----------------------------
  /*
  public String getUpFace(String newFace) {
    String face = upFace;
    upFace = newFace;
    return face;
  }

  public int getFlipCtr(int flip) {
    int flipNum = flipCtr;
    flipCtr = flip;
    return flipNum;
  }

  public double getValue(int val) {
    int amount = value;
    value = val;
    return amount;
  }

  public int getHeadsCtr(int head) {
    int headNum = headsCtr;
    headsCtr = head;
    return headNum;
  }

  public int getTailsCtr(int tail) {
    int tailNum = tailsCtr;
    tailsCtr = tail;
    return tailNum;
  }
  */
  // ----------------------------

  /***
   * assignValue() -- set a Coin's monetary value based on its name
   * precond:  input String is a valid coin name ("penny", "nickel", etc.)
   * postcond: instvar value gets appropriate value
   * Returns value assigned.
   ***/

  public double assignValue( String s ) {
    if(s == "penny"){
		    value = 0.01;
		}
		else if(s == "nickel"){
		    value = 0.25;
		}
		else if(s == "dime"){
		    value = 0.10;
		}
		else if(s == "quarter"){
		    value = 0.25;
		}
		else if(s == "half dollar"){
		    value = 0.50;
		}
		else if (s == "dollar"){
		    value = 1.00;
		}
		return value;
  }

  /***
      reset() -- initialize a Coin
      precond:  s is "heads" or "tails", 0.0 <= d <= 1.0
      postcond: Coin's attribs reset to starting vals
  ***/
  public void reset( String s, double d ) {
    upFace = nowFace;
  }

  /***
   * String flip() -- simulates a Coin flip
   * precond:  bias is a double on interval [0.0,1.0]
   * (1.0 indicates always heads, 0.0 always tails)
   * postcond: upFace updated to reflect result of flip.
   * flipCtr incremented by 1.
   * Either headsCtr or tailsCtr incremented by 1, as approp.
   * Returns "heads" or "tails"
   ***/
  /*
  public String flip() {
    Double[] values = {0.01, 0.05, 0.10, 0.25, 0.50, 1.00};
    int i = 0;
    flipCtr = 0;
    if (value >= 0.0 && value <= 1.0) {
      value = value.random();
    }
    for (i=0; i<values.length(); i ++) {
      System.out.println(value);
      flipCtr += 1;
    }
  }
*/
  /***
   * boolean equals(Coin) -- checks to see if 2 coins have same face up
   * precond: other is not null
   * postcond: Returns true if both coins showing heads
   * or both showing tails. False otherwise.
   ***/
  public boolean equals( Coin other ) {
    // return (other == denomination);
    if (upFace == other.upFace){
			return true;
		} else {
			return false;
		}
  }

  /***
   * String toString() -- overrides toString() provided by Java
   * precond: n/a
   * postcond: Return String comprised of name and current face
   ***/
  public String toString() {
    String reStr = "\nYour coin:\n-------------";
    reStr += "\nCurrent denomination: " + denomination;
    reStr += "\nCurrent face: " + upFace;
    return reStr;
  }

  public static void main(String[] args){
    Coin mine = new Coin();
    // mine.name("penny");
  }

}//end class
