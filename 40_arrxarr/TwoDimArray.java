/******************************
 * class TwoDimArray
 * (skeleton)
 * practice working with 2D arrays
 ******************************/

/*
Java Coffee: Courtney Huang, Jason Yang, Yuki Feng
APCS pd7
HW40 -- 2D arrays
2021-11-30
*/

/*
QCC:
why can't a for each loop modify the contents of element?
DISCO:
for each loop does not update like the for loop, it just iterates through the number of elements then stops.
when dealing w 2D arrays, you have to nest in loops bc then it will just call for the memory location of that array, not what you want to ouput, which is all the elements inside the array.
*/

public class TwoDimArray
{

  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOR loop
  public static void print1( int[][] a )
  {
    for (int i=0; i < a.length; i++){
      for (int j=0; j < a[i].length; j++){
        System.out.print(a[i][j]);
      }
      System.out.println();
    }
  }


  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOREACH loop
  public static void print2( int[][] a )
  {
    for (int[] i: a) {
      for (int j : i) {
        System.out.print(j);
      }
    System.out.println();
    }
  }


  //postcond: returns sum of all items in 2D int array a
  public static int sum1( int[][] a )
  {
    int sum1 = 0;
    for (int i=0; i < a.length; i++){
      for (int j=0; j < a[i].length; j++){
        sum1 += a[i][j];
      }
    }
    return(sum1);
  }


  //postcond: returns sum of all items in 2D int array a
  //          * uses helper fxn sumRow
  public static int sum2( int [][] m )
  {
    int sum2 = 0;
    for (int i=0; i < m.length; i++) {
      sum2 += sumRow(i, m); // can also do sumRow2 instead of sumRow bc they do same thing
    }
    return sum2;
  }


  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOR loop
  public static int sumRow( int r, int[][] a )
  {
    int sumRow = 0;
    for (int i=0; i < a[r].length; i++) {
      sumRow += a[r][i];
    }
    return sumRow;
  }


  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOREACH loop
  public static int sumRow2(int r, int[][] m)
  {
    // *** YOUR IMPLEMENTATION HERE ***
    int summer = 0;
    for (int i: m[r]) {
        summer += i;
    }
    return summer;
  }


  public static void main( String [] args )
  {
      int [][] m1 = new int[4][2];
      int [][] m2 = { {2,4,6}, {3,5,7} };
      int [][] m3 = { {2}, {4,6}, {1,3,5} };

      System.out.print("testing print1...\n");
      print1(m1);
      print1(m2);
      print1(m3);

      System.out.print("testing print2...\n");
      print2(m1);
      print2(m2);
      print2(m3);

      System.out.print("testing sum1...\n");
      System.out.println("sum m1 : " + sum1(m1));
      System.out.println("sum m2 : " + sum1(m2));
      System.out.println("sum m3 : " + sum1(m3));

      System.out.print("testing sum2...\n");
      System.out.println("sum m1 : " + sum2(m1));
      System.out.println("sum m2 : " + sum2(m2));
      System.out.println("sum m3 : " + sum2(m3));

    // your own custom test cases welcomed and encouraged

      System.out.print("testing sumRow...\n");
      System.out.println("sum m1 : " + sumRow(0, m1));
      System.out.println("sum m2 : " + sumRow(1, m2));
      System.out.println("sum m3 : " + sumRow(2, m3));

      System.out.print("testing sumRow2...\n");
      System.out.println("sum m1 : " + sumRow2(0, m1));
      System.out.println("sum m2 : " + sumRow2(1, m2));
      System.out.println("sum m3 : " + sumRow2(2, m3));

  }

}//end class TwoDimArray
