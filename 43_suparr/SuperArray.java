/*
 * Java Coffee- Courtney huang, Yuki Feng, Jason Yang
 * APCS PD07
 * HW43: Array of Steel
 * 2021-12-6
 * time spent - 0.5 hours
 *
 * Disco- when accessing the length of a superarray, you have to include the original name
 *
 * QCC-
 *
*/
/***************************
 * class SuperArray
 * Wrapper class for array. Facilitates resizing,
 * getting and setting element values.
 ***************************/


public class SuperArray
{

  private int[] _data;  //underlying container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray()
  {
    _data = new int [10];
    for (int i = 0; i < _data.length ; i++){
      _data[i] = 0;
    }
  }


  //output SuperArray in [a,b,c] format
  public String toString()
  {
    String bracket = "[";
    for (int i = 0; i < _data.length - 1; i++){
      bracket = bracket + _data[i] + ",";
    }
    return bracket + _data[_data.length - 1] + "]";
  }


  // double capacity of SuperArray
  private void expand()
  {
   int[] _newData = new int[_data.length * 2];
   for (int i = 0; i < _data.length; i++) {
     _newData[i] = _data[i];
   }
   _data = _newData;
  }


  //accessor -- return value at specified index
  public int get( int index )
  {
    return _data[index];
  }


  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal )
  {
    _data[index] = newVal;
    return (get(index));
  }


  //main method for testing
  public static void main( String[] args )
  {

      SuperArray curtis = new SuperArray();
      System.out.println( "Printing empty SuperArray curtis..." );
      System.out.println( curtis );

      for( int i = 0; i < curtis._data.length; i++ ) {
      curtis.set( i, i * 2 );
      }

      System.out.println("Printing populated SuperArray curtis...");
      System.out.println(curtis);

      for( int i = 0; i < 3; i++ ) {
      curtis.expand();
      System.out.println("Printing expanded SuperArray curtis...");
      System.out.println(curtis);
      }
      // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~*/
  }//end main()


}//end class