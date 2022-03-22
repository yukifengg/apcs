// Java Coffe- Yuki Feng, Courtney Huang, Jason Yang
// APCS pd07
// HW52 -- implementing selection sort
// 2022-01-05w
// time spent:  .75 hrs

/******************************
 *   class SelectionSort -- implements SelectionSort algorithm
 *
 * ALGO: Find most extreme case, swap end elemnt with most extreme, repeat until you go through entire array
 *
 * DISCO
 *
 * QCC
 * q0: How many passes to sort n elements?
 * a0: n- 1 passes
 * q1: What do you know after pass p?
 * a1: The last p elements are in correct positions
 * q2: How do you know if sorted?
 * a2: After the n - 1 pass
 * q3: What does a pass boil down to?
 * a3: You swap the greatest value with the value on the very end and repeat.
 ******************************/


import java.util.ArrayList;

public class SelectionSort
{

  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond: lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi )
  {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al )
  {
    int randomIndex;
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // VOID version of SelectionSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void selectionSortV( ArrayList<Comparable> data )
  {
    //note: this version places greatest value at "rightmost" end

    //maxPos will point to position of SELECTION (greatest value)
    int maxPos;

     for (int pass = data.size() - 1; pass > 0; pass--) {
       maxPos = pass;
          System.out.println("\nbegin pass " + (data.size() - pass));// diag

           for (int i = 0; i < pass; i++) {
               if (data.get(i).compareTo(data.get(maxPos)) > 0) {
                   maxPos = i;
               }

               System.out.println("maxPos: " + maxPos);// diag
               System.out.println(data);// diag
           }

           // swap last element with element at maxPos.
           Comparable joemama = data.get(pass);
           data.set(pass, data.get(maxPos));
           data.set(maxPos, joemama);

           System.out.println("after swap: " + data);// diag

  }
}//end selectionSort


  // ArrayList-returning selectionSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable> selectionSort( ArrayList<Comparable> input )
  {

    ArrayList<Comparable> data = new ArrayList<Comparable>();

    for (Comparable o : input) {
          data.add(o);
      }

      selectionSortV(data);

      return data;
  }//end selectionSort


  public static void main( String [] args )
  {

    ArrayList glen = new ArrayList<Integer>();
          glen.add(7);
          glen.add(1);
          glen.add(5);
          glen.add(12);
          glen.add(3);
          System.out.println("ArrayList glen before sorting:\n" + glen);
          selectionSortV(glen);
          System.out.println("ArrayList glen after sorting:\n" + glen);
          ArrayList coco = populate(10, 1, 1000);
          System.out.println("ArrayList coco before sorting:\n" + coco);
          selectionSortV(coco);
          System.out.println("ArrayList coco after sorting:\n" + coco);
          /*

          /*
           * ==========for AL-returning methods==========
           * ArrayList glen = new ArrayList<Integer>();
           * glen.add(7);
           * glen.add(1);
           * glen.add(5);
           * glen.add(12);
           * glen.add(3);
           * System.out.println( "ArrayList glen before sorting:\n" + glen );
           * ArrayList glenSorted = selectionSort( glen );
           * System.out.println( "sorted version of ArrayList glen:\n"
           * + glenSorted );
           * System.out.println( "ArrayList glen after sorting:\n" + glen );
           * ArrayList coco = populate( 10, 1, 1000 );
           * System.out.println( "ArrayList coco before sorting:\n" + coco );
           * ArrayList cocoSorted = selectionSort( coco );
           * System.out.println( "sorted version of ArrayList coco:\n"
           * + cocoSorted );
           * System.out.println( "ArrayList coco after sorting:\n" + coco );
           * System.out.println( coco );
           * ============================================
           */

  }//end main

}//end class SelectionSort
