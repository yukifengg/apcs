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
size() -> O(1)
  - takes least time bc only need to pass thru once since you are not changing any element in array
toString() -> O(1)
  - one pass
get(int i) ->
  - O(1) because it traverses once only bc it only needs one pass to find the item
remove(int i) -> O(n)
  - when you remove at index you have to shift each element over thus multiple passes
remove() -> O(1)
  - pass thru once to remove element at end
addLinear(newVal) -> O(1)
  - adding to the end so pass once
addBinary(int i, newVal) -> O(log(n))
  - because binary is adding at index and shifting elements there will be no constant equation but logaithmic because it sorts from both directions
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
