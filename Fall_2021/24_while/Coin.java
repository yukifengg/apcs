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
  private String upFace, name;
  private String denomination;
  private int flipCtr, headsCtr, tailsCtr;
  private double bias = .5;

  // default contructor
  public Coin() {
  	reset( "heads", 0.5 );
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
  this();

    //this.denomination = s;
    this.name = s;
    assignValue(s);
  }


  /***
      Coin(String,String) -- 2nd overloaded contructor
      precond:
      postcond:
  ***/
  public Coin( String s, String nowFace ) {
    // this.denomination = s;
    //String oldFace = upFace;
    this(s);
    upFace = nowFace;
    }

  // Accessors...
  // ----------------------------

  public String getUpFace() {
    return upFace;
  }

  public int getFlipCtr() {
    return flipCtr;
  }

  public double getValue() {
    return value;
  }

  public int getHeadsCtr() {
    return headsCtr;
  }

  public int getTailsCtr() {
    return tailsCtr;
  }

  // ----------------------------

  /***
   * assignValue() -- set a Coin's monetary value based on its name
   * precond:  input String is a valid coin name ("penny", "nickel", etc.)
   * postcond: instvar value gets appropriate value
   * Returns value assigned.
   ***/

  public double assignValue( String s ) {
	if(s.equals ("penny")){
	   value = 0.01;
	}
	else if(s.equals ("nickel")){
	   value = 0.25;
	}
	else if(s.equals ("dime")){
	   value = 0.10;
	}
	else if(s.equals ("quarter")){
	   value = 0.25;
	}
	else if(s.equals ("half dollar")){
	   value = 0.50;
	}
	else if (s.equals ("dollar")){
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
    flipCtr = 0;
    tailsCtr  = 0;
    headsCtr = 0;
    upFace = s;
    bias = d;
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

  public String flip() {
    double randDbl = Math.random();
    if (randDbl < bias) {
    upFace = "heads";
    headsCtr += 1;
    }
    else {
    upFace = "tails";
    tailsCtr += 1;
    }
    flipCtr += 1;
    return upFace;
  }

  /***
   * boolean equals(Coin) -- checks to see if 2 coins have same face up
   * precond: other is not null
   * postcond: Returns true if both coins showing heads
   * or both showing tails. False otherwise.
   ***/
  public boolean equals( Coin other ) {
    // return (upFace.equals(other.upFace);
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
    //String reStr = "\nYour coin:\n-------------";
    //reStr += "\nCurrent denomination: " + denomination;
    //reStr += "\nCurrent face: " + upFace;
    //return reStr;
    return "" + name + " -- " + upFace;
  }
}//end class
