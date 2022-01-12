/*
TNPG: Java Coffee: Courtney Huang, Jason Yang, Yuki Feng
APCS period 7
HW 55: Never Fear, Big Oh Is Here!
Time: .5 hrs
*/

/*
DISCO:
QCC:
*/

/*
Insert/augment descriptive comment preceding each method of OrderedArrayList, categorizing its execution time…
*/
import java.util.ArrayList;

public class OrderedArrayList {

  private ArrayList<Integer> _data;

  // default constructor
  // initializes instance variables
  public OrderedArrayList()
  {
    _data = new ArrayList<Integer>();
  }

  public String toString()
  {
	return _data.toString();
  }

  public Integer remove( int i )
  {
	return _data.remove(i);
  }

  public int size()
  {
	return _data.size();
  }

  public Integer get( int i )
  {
	return _data.get(i);
  }

  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a linear search to find appropriate index
  public void addLinear(Integer newVal)
  {	if (_data.size() == 0){
  		_data.add(newVal);
  		}
  		else {
       for (int x = 0; x < _data.size(); x++) {
         if (_data.get(x) <= newVal) {
         }
         else{
         _data.add(x, newVal);
         break;
         }

       }
       }
  }

  // main method solely for testing purposes
  public static void main( String[] args )
  {

    OrderedArrayList Franz = new OrderedArrayList();
    // testing linear search
    for( int i = 0; i < 15; i++ )
      Franz.addLinear( (int)( 50 * Math.random() ) );
    System.out.println( Franz );

  }//end main
}//end class
