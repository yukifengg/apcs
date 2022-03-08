/*
TNPG stingRAY: Rin Fukuoka, Abdullah Faruque, Yuki Feng
APCS pd 08
HW71: Whut Dis.
2022-03-07
time spent: .5 hrs
*/

public class Mysterion {
  private int[] arr; //array

  public String toString() {
    String foo = "[";
    for( int i = 0; i < arr.length; i++ ) {
      foo += arr[i] + ",";
    }
    if ( foo.length() > 1 )
      //shave off trailing comma
      foo = foo.substring( 0, foo.length()-1 );
    foo += "]";
    return foo;
  }

  public Mysterion(int size) {
    arr = new int[size];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int) (Math.random() * 15); //fills array w values up to 15
    }
  }

  private void mysteryAlgo() {
    int a = 0; //first pos in array
    int b = arr.length - 1; //last pos in array
    int c = b/2; //middle pos in array
    int v = arr[c]; // sets v to value of middle pos array

    /**** swapping arr[c] and arr[b] ****/
    int temp = arr[c];
    arr[c] = arr[b];
    arr[b] = temp;
    /***********************************/

    int s = a; //sets s to a
    for (int i = 0; i <= b-1; i++) {
      if (arr[i] < v) {
        /**** swapping arr[s] and arr[i] ****/
        temp = arr[s];
        arr[s] = arr[i];
        arr[i] = temp;
        /***********************************/
        s+=1;
      }
    }

    /**** swapping arr[b] and arr[s] ****/
    temp = arr[b];
    arr[b] = arr[s];
    arr[s] = temp;
    /***********************************/
  } //end mysteryAlgo


  public static void main(String[] args) {
    Mysterion m = new Mysterion(5); //5 elem array

    System.out.println("old array");
    System.out.println(m);
    m.mysteryAlgo();

    System.out.println("new array");
    System.out.println(m);
  } //end main
} //end class
