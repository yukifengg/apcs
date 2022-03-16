// Team Acid: Yuki Feng, Tasnim Chowdhury, Faiyaz Rafee
// APCS pd08
// HW77: Insert|Remove
// 2022-03-15
// time spent: 0.5 hrs


/***
 * class LList
 * Implements a linked list of LLNodes, each containing String data
 **/


/******
DISCO:
  tmp is a finnicky little thing...

QCC:
  why does it still print null if we setCargo of tmp to null?? shouldnt that stop the process of the toString loop checking for tmp!=null

ALGO ADD
1. Create alias for _head called tmp
2. If index is not 0 or the last index then set tmp to be the node at index.
  a. Make a copy of this node called newNode
  b. Change this copy's cargo to newVal and it's CDR to tmp's _nextNode
  c. Change tmp's CDR to newNode
3. If index is 0, use add()
4. If index is the last node, set tmp to be the last one by traversal. Create
newNode with cargo tobe newVal and its CDR to be null and change tmp's CDR to newNode.

ALGO REM
1. Create alias for _head called tmp
2. Iterate through _head and update tmp with each new node value until you reached the desired node at the specified index used in calling remove.
3. Once the index is reached, String nextVal takes the car of the next linked node. tmp's car then takes on the value of nextVal and tmp is updated to the next node.
4. This process of updating the node values occurs until the last index is reached.
5. The last 2 indices will now have the same value. Set the cdr of index [_size - 2] to null, which will result in it cutting off the linkage to the last index, thus removing the last value.
6. Decrement size by 1.

******/
public class LList implements List //interface def must be in this dir
{

  //instance vars
  private LLNode _head;
  private int _size;

  // constructor -- initializes instance vars
  public LList( )
  {
    _head = null; //at birth, a list has no elements
    _size = 0;
  }


  //--------------v  List interface methods  v--------------

  public boolean add( String newVal )
  {
    LLNode tmp = new LLNode( newVal, _head );
    _head = tmp;
    _size++;
    return true;
  }

  //insert at specified index
  public void add( int index, String newVal ){
    LLNode tmp = _head;
    if (index < _size) {
        for (int i = 0; i < index; i++){
          tmp = tmp.getNext();
        }
        LLNode newNode = new LLNode(tmp.getCargo(), tmp.getNext());
        tmp.setCargo(newVal);
        tmp.setNext(newNode);
    } else if (index == 0) {
      add(newVal);
    } else {
      for (int i = 0; i < _size-1; i++){
        tmp = tmp.getNext();
      }
      LLNode newNode = new LLNode(newVal, null);
      tmp.setNext(newNode);
    }
      _size++;
  }


  public String get( int index )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    String retVal;
    LLNode tmp = _head; //create alias to head

    //walk to desired node
    for( int i=0; i < index; i++ )
      tmp = tmp.getNext();

    //check target node's cargo hold
    retVal = tmp.getCargo();
    return retVal;
  }


  public String set( int index, String newVal )
  {

    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    LLNode tmp = _head; //create alias to head

    //walk to desired node
    for( int i=0; i < index; i++ )
      tmp = tmp.getNext();

    //store target node's cargo
    String oldVal = tmp.getCargo();

    //modify target node's cargo
    tmp.setCargo( newVal );

    return oldVal;
  }

  //remove node at index
  public String remove( int index ) {
    LLNode tmp = _head; //create alias to head
    String retVal = "";

    //walk to desired node
    for ( int i=0; i < index; i++ ) {
      tmp = tmp.getNext();
    }

    //move nodes after desired node over
    for (int i = index; i < _size-1; i++ ){
      String nextVal = tmp.getNext().getCargo();
      tmp.setCargo(nextVal);
      tmp = tmp.getNext();
      System.out.println(tmp);
    }

    //remove end node
    tmp.setCargo(null);
    tmp.setNext(null);
    System.out.println(tmp);

    _size--;
    return retVal;
  }

  // for (int i = 0; i < index - 1; i++) {
    //   //temp is copy of the list node
    //   tmp = tmp.getNext(); //next val
    //   retVal = tmp.getNext().getCargo(); //string = cargo of temp
    //   tmp.setNext(tmp.getNext().getNext()); // gets rid of node after it
    // }

  //return number of nodes in list
  public int size() {
    return _size;
  }

  //--------------^  List interface methods  ^--------------


  // override inherited toString
  public String toString()
  {
    String retStr = "HEAD->";
    LLNode tmp = _head; //init tr
    while( tmp != null ) {
	    retStr += tmp.getCargo() + "->";
	    tmp = tmp.getNext();
    }
    retStr += "NULL";
    return retStr;
  }


  //main method for testing
  public static void main( String[] args )
  {
    LList james = new LList();

    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("beat");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("a");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("need");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("I");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    System.out.println( "2nd item is: " + james.get(1) );

    james.set( 1, "got" );
    System.out.println( "...and now 2nd item is: " + james.set(1,"got") );

    System.out.println( james );

    System.out.println( "\n...starting removal of 2nd item" );

    james.remove( 1 );
    System.out.println( "...after removing 2nd item: " );

    System.out.println( james );

    james.add( 1 , "dropped");
    System.out.println( "...after adding item in 2nd place : " );

    System.out.println( james );
  }

}//end class LList
