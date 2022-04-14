// Team Acid: Yuki Feng, Tasnim Chowdhury, Faiyaz Rafee
// APCS pd08
// HW91: Deque the Halls
// 2022-04-13
// time spent: 0.5 hrs

/*
DISCO:
- offer element and poll would be good for deques w limited capacity. we think it
might help with memory so the machine can prevent running out of space?
QCC:
- Big O?
- which better? AL or LL -deque? LL already implements Deque, though..?
*/

import java.util.ArrayList;

public class ALDeque<QUASAR> implements Deque<QUASAR> {
  private ArrayList<QUASAR> list;

  public ALDeque(int _size)
  {
    list = new ArrayList<QUASAR>(_size);
  }

  /*
  inserts at head end deque, throws exception
  */
  public void addFirst( QUASAR x) {
    list.add(0, x);
  }

  /*
  inserts at tail end deque, throws an IllegalStateException if no space is
  currently available
  */
  public void addLast( QUASAR x ) {
    list.add(x);
  }

  /*
  Removes the first element from this deque, throws exception
  */
  public QUASAR removeFirst() {
    return list.remove(0);
  }

  /*
  Removes the last element from this deque, throws exception
  */
  public QUASAR removeLast() {
    return list.remove(list.size() - 1);
  }

  /*
  Retrieves, but does not remove, the head of the queue represented by this
  deque, returns null if empty
  */
  public QUASAR peekFirst() {
    return list.get(0);
  }

  /*
  Retrieves, but does not remove, the tail of the queue represented by this
  deque, returns null if empty
  */
  public QUASAR peekLast() {
    return list.get(list.size() - 1);
  }

  /*
  inserts at head end deque, returns true or false if space available
  */
  public boolean offerFirst(QUASAR x)
  {
    return list.add(0,x);
  }

  /*
  inserts at tail end deque, returns true or false if space available
  */
  public boolean offerLast(QUASAR x)
  {
    return list.add(x);
  }

  /*
  removes at head end deque, returns null
  */
  public QUASAR pollFirst()
  {
    return list.remove(0);
  }

  /*
  removes at tail end deque, returns null
  */
  public QUASAR pollLast()
  {
    return list.remove(list.size() - 1);
  }

  /*
  Retrieves, but does not remove, at tail end deque, throws exception
  */
  public QUASAR element()
  {
    return list.get(list.size() - 1);
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
    ALDeque Al = new ALDeque(10);
    Al.addFirst(1);
    Al.addFirst(2);
    Al.addFirst(3);
    System.out.println("filled Al: " + Al);
    Al.removeFirst();
    System.out.println("removed head: " + Al);
    System.out.println("Peekin at new head: " + Al.peekFirst());
  }
}//end class
