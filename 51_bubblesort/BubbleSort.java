// Java Coffee: Courtney Huang, Yuki Feng, Jason Yang
// APCS pd 7
// HW51 -- implementing bubblesort
// 2022-01-03
// time spent:  hrs

/******************************
 * class BubbleSort -- implements bubblesort algorithm (vanilla)
 *
 * ALGO:
 *
 * DISCO
 *
 * QCC
 * q0: If a pass requires no swaps, what do you know?
 * a0:  It is already in order.
 * q1: After pass p, what do you know?
 * a1: p elements starting on the left are in order.
 * q2: How many passes are necessary to completely sort?
 * a2: n-1? n being size of array
 *
 ******************************/

import java.util.ArrayList;

public class BubbleSort
{

  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond:  lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi ) {
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
    //setup for traversal fr right to left
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // VOID version of bubbleSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void bubbleSortV( ArrayList<Integer> data )
  {
    for (int p=0; p < data.size(); p++){ //makes sure it goes through all passes
      for (int i = data.size()-1; i>0; i--){ //for loop for each pass
        //gets element at index
        int bob = data.get(i);
        int jeff = data.get(i-1);
        //swap ints
        if (bob < jeff){
          data.set(i, jeff);
          data.set(i-1, bob);
        }
      }
    }
  }


  // ArrayList-returning bubbleSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Integer> bubbleSort( ArrayList<Integer> input )
  {
    bubbleSortV(input);
    return input;
  }


  public static void main( String [] args )
  {

    /*===============for VOID methods=============
    ============================================*/
      // ArrayList glen = new ArrayList<Integer>();
      // glen.add(7);
      // glen.add(1);
      // glen.add(5);
      // glen.add(12);
      // glen.add(3);
      // System.out.println( "ArrayList glen before sorting:\n" + glen );
      // bubbleSortV(glen);
      // System.out.println( "ArrayList glen after sorting:\n" + glen );
      //
      // ArrayList coco = populate( 10, 1, 1000 );
      // System.out.println( "ArrayList coco before sorting:\n" + coco );
      // bubbleSortV(coco);
      // System.out.println( "ArrayList coco after sorting:\n" + coco );

    /*==========for AL-returning methods==========
    ============================================*/
      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      ArrayList glenSorted = bubbleSort( glen );
      System.out.println( "sorted version of ArrayList glen:\n"
      + glenSorted );
      System.out.println( "ArrayList glen after sorting:\n" + glen );

      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      ArrayList cocoSorted = bubbleSort( coco );
      System.out.println( "sorted version of ArrayList coco:\n"
      + cocoSorted );
      System.out.println( "ArrayList coco after sorting:\n" + coco );
      System.out.println( coco );


  }//end main

}//end class BubbleSort
