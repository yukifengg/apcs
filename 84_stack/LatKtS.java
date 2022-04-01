/***
 * skeleton for class LatKtS
 * Driver class for Latkes.
 * Uses a stack to reverse a text string, check for sets of matching parens.
 **/

public class LatKtS
{

  /***
   * precondition:  input string has length > 0
   * postcondition: returns reversed string s
   *                flip("desserts") -> "stressed"
   **/
  public static String flip( String s )
  {
    int numChars = s.length();
    Latkes yum = new Latkes( numChars );

    for( int i = 0; i < numChars; i++ ) {
      yum.push( s.substring(i,i+1) );
    }

    String retStr = "";
    for( int i = 0; i < numChars; i++ ) {
      retStr += yum.pop();
    }

    return retStr;
  }//end flip()


  /***
   * precondition:  s contains only the characters {,},(,),[,]
   * postcondition: allMatched( "({}[()])" )    -> true
   *                allMatched( "([)]" )        -> false
   *                allMatched( "" )            -> true
   **/
  public static boolean allMatched( String s )
  {
    Latkes stack = new Latkes(s.length());

    //iterate thru string one char at a time
    for (int i = 0 ; i < s.length(); i ++) {
      String tmp = s.substring(i, i+1);

      // opener? push.
      if (
          tmp.equals("(")
          ||
          tmp.equals("{")
          ||
          tmp.equals("[")
          )
        stack.push(tmp);

      // not an opener, so if there is anything on the stack then we have a problem
      else if (stack.isEmpty()) return false;

      // closer? pop.
      // pop'd val not a match? ret F
      else if (
               tmp.equals(")") && !stack.pop().equals("(")
               ||
               tmp.equals("}") && !stack.pop().equals("{")
               ||
               tmp.equals("]") && !stack.pop().equals("[")
               )
        return false;
    }

    //made it this far?
    // if stack empty, then every opener had a matching closer
    // otherwise, there was a mismatch or a missing component
    return stack.isEmpty();
  }//end allMatched()



  /* ========= ALTERNATE VERSION ==========================
  public static boolean allMatched( String s )
  {
    int maxSize = s.length();
    Latkes parenStack = new Latkes(maxSize);

    //process input string, one char at a time
    for( int i = 0; i < s.length(); i++ ) {
      String curr = s.substring( i, i+1 );

      // if an opener, push onto stack
      if ( curr.equals("(") ||
           curr.equals("{") ||
           curr.equals("[") ) {
        parenStack.push( curr );
      }
      // if a closer, pop from stack, chk for match
      else if ( curr.equals(")") ) {
        if ( parenStack.isEmpty() ||
             !parenStack.pop().equals("(") )
          return false;
      }
      else if ( curr.equals("}") ) {
        if ( parenStack.isEmpty() ||
             !parenStack.pop().equals("{") )
          return false;
      }
      else if ( curr.equals("]") ) {
        if ( parenStack.isEmpty() ||
             !parenStack.pop().equals("[") )
          return false;
      }
    }

    if ( parenStack.isEmpty() )
      return true;
    else {
      return false;
    }
  }//end allMatched()
  ========================== end alternative version block =========*/


  //main method to test
  public static void main( String[] args )
  {
    System.out.println("stressed");
    System.out.println(flip("stressed"));
    System.out.println();

    System.out.println(allMatched( "({}[()])" )); //true
    System.out.println("...t");
    System.out.println();

    System.out.println(allMatched( "([)]" ) ); //false
    System.out.println("...f");
    System.out.println();

    System.out.println(allMatched( "" ) ); //true
    System.out.println("...t");
    System.out.println();

    System.out.println(allMatched( "(){([])}" ) ); //true
    System.out.println("...t");
    System.out.println();

    System.out.println(allMatched( "](){([])}" ) ); //false
    System.out.println("...f");
    System.out.println();

    System.out.println(allMatched( "(){([])}(" ) ); //false
    System.out.println("...f");
    System.out.println();

    System.out.println(allMatched( "()[[]]{{{{((([])))}}}}" ) ); //true
    System.out.println("...t");
    System.out.println();

    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }

}//end class LatKtS
