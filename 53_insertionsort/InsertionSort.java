// JavaCoffee- Yuki Feng, Courtney Huang, Jason Yang
// APCS pd7
// HW53 -- implementing selection sort
// 2022-01-06r
// time spent:  0.75 hrs

/******************************
 * class InsertionSort -- implements InsertionSort algorithm
 *
 * ALGO:
 * - Partition list into sorted and unsorted regions
 * - Walk element from unsorted region up to where it belongs in sorted
 * - Increase size of sorted partition
 * - Repeat 2,3
 *
 * DISCO
 *
 * QCC
 * q0: How many passes to sort n elements?
 * a0: n-1 passe
 * q1: What do you know after pass p?
 * a1: p elements form the left are sorted
 * q2: How will you know when sorted?
 * a2: When partition equals the array sizr
 * q3: What constitues a pass?
 * a3: Once you swapped a number to its correct place
 * q4: What must you track?
 * a4: the index of element you are comparing to others
 ******************************/

import java.util.ArrayList;

public class InsertionSort {
  // ~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  // precond: lo < hi && size > 0
  // postcond: returns an ArrayList of random integers
  // from lo to hi, inclusive
  public static ArrayList populate(int size, int lo, int hi) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while (size > 0) {
      // offset + rand int on interval [lo,hi]
      retAL.add(lo + (int) ((hi - lo + 1) * Math.random()));
      size--;
    }
    return retAL;
  }

  // randomly rearrange elements of an ArrayList
  public static void shuffle(ArrayList al) {
    int randomIndex;
    for (int i = al.size() - 1; i > 0; i--) {
      // pick an index at random
      randomIndex = (int) ((i + 1) * Math.random());
      // swap the values at position i and randomIndex
      al.set(i, al.set(randomIndex, al.get(i)));
    }
  }
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  // VOID version of InsertionSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void insertionSortV(ArrayList<Comparable> data) {
    for (int partition = 1; partition < data.size(); partition++) {
      // partition marks first item in unsorted region

      System.out.println("\npartition: " + partition + "\tdataset:"); // diag
      System.out.println(data);

      // traverse sorted region from right to left
          for (int i = partition; i > 0; i--) {

        // "walk" the current item to where it belongs by swapping adjacent items
        // by swapping adjacent items
              if (data.get(i).compareTo(data.get(i - 1)) == -1) {

                  System.out.println("swap indices " + (i - 1) + " & " + i + "..."); // diag
                  Comparable temp = data.get(i);
                  data.set(i, data.get(i - 1));
                  data.set(i - 1, temp);
        } else {
          break;
        }
      }
    }
  }// end insertionSortV

  // ArrayList-returning insertionSort
  // postcondition: order of input ArrayList's elements unchanged
  // Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable> insertionSort(ArrayList<Comparable> input) {
    // declare and initialize empty ArrayList for copying
    ArrayList<Comparable> data = new ArrayList<Comparable>();

    // copy input into data
    for (Comparable o : input)
      data.add(o);

    // sort the array
    insertionSortV(data);

    // return the sorted array
    return data;
  }// end insertionSort

  public static void main(String[] args) {
    System.out.println("\n*** Testing sort-in-place (void) version... *** ");
    ArrayList glen = new ArrayList<Integer>();
    glen.add(7);
    glen.add(1);
    glen.add(5);
    glen.add(12);
    glen.add(3);
    System.out.println("\nArrayList glen before sorting:\n" + glen);
    insertionSortV(glen);
    System.out.println("\nArrayList glen after sorting:\n" + glen);

    ArrayList coco = populate(10, 1, 1000);
    System.out.println("\nArrayList coco before sorting:\n" + coco);
    insertionSortV(coco);
    System.out.println("\nArrayList coco after sorting:\n" + coco);



  }// end main

}// end class InsertionSort
