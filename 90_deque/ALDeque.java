// Team Acid: Yuki Feng, Tasnim Chowdhury, Faiyaz Rafee
// APCS pd08
// HW90: Swabbing the Deque
// 2022-04-12
// time spent: 0.5 hrs

/*
DISCO:
-
QCC:
-
*/

import java.util.ArrayList;

public class ALDeque<QUASAR> implements Deque<QUASAR> {
  private ArrayList<QUASAR> list;

  public ALDeque()
  {
    list = new ArrayList<QUASAR>();
  }
    /*
    inserts at tail end deque, throws an IllegalStateException if no space is
    currently available
    */
    public boolean add( QUASAR x ) {
      return list.add(x);
    }

    /*
    Removes the first occurrence of the specified element from this deque.
    */
    public QUASAR remove() {
      return list.remove(0);
    }

    public QUASAR peek() {
      return list.get(0);
    }

    //Stringification
    public String toString() {
      String foo = "[";
      if (list.size() != 0) {
        for (int i = 0; i < list.size() - 1; i++) {
          foo += list.get(i) + ", ";
        }
        foo += list.get(list.size() - 1);
      }
      foo += "]";
      return foo;
    }

    public static void main(String[] args) {
      ALDeque Al = new ALDeque();
      Al.add(1);
      Al.add(2);
      Al.add(3);
      System.out.println("filled Al: " + Al);
      Al.remove();
      System.out.println("removed head: " + Al);
      System.out.println("Peekin at new head: " + Al.peek());
    }
}//end class
