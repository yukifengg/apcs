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

import java.util.LinkedList;

public class LLDeque<QUASAR> implements Deque<QUASAR> {
  private LinkedList<QUASAR> list;

  public LLDeque()
  {
    list = new LinkedList<QUASAR>();
  }

  /*
  inserts at head end deque, throws exception
  */
  public void addFirst(QUASAR x)
  {
    list.addFirst(x);
  }

  /*
  inserts at tail end deque, throws an IllegalStateException if no space is
  currently available
  */
  public void addLast(QUASAR x)
  {
    list.addLast(x);
  }

  /*
  Removes the first element from this deque, throws exception
  */
  public QUASAR removeFirst()
  {
    return list.removeFirst();
  }

  /*
  Removes the last element from this deque, throws exception
  */
  public QUASAR removeLast()
  {
    return list.removeLast();
  }

  /*
  Retrieves, but does not remove, the head of the queue represented by this
  deque, returns null if empty
  */
  public QUASAR peekFirst()
  {
    return list.peekFirst();
  }

  /*
  Retrieves, but does not remove, the tail of the queue represented by this
  deque, returns null if empty
  */
  public QUASAR peekLast()
  {
    return list.peekLast();
  }

  /*
  inserts at head end deque, returns true or false if space available
  */
  public boolean offerFirst(QUASAR x)
  {
    return list.offerFirst(x);
  }

  /*
  inserts at tail end deque, returns true or false if space available
  */
  public boolean offerLast(QUASAR x)
  {
    return list.offerLast(x);
  }

  /*
  removes at head end deque, returns null
  */
  public QUASAR pollFirst()
  {
    return list.pollFirst();
  }

  /*
  removes at tail end deque, returns null
  */
  public QUASAR pollLast()
  {
    return list.pollLast();
  }

  /*
  Retrieves, but does not remove, at tail end deque, throws exception
  */
  public QUASAR element()
  {
    return list.element();
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
    LLDeque LL = new LLDeque();
    LL.addFirst(1);
    LL.addFirst(2);
    LL.addFirst(3);
    System.out.println("filled LL: " + LL);
    LL.removeLast();
    System.out.println("removed tail: " + LL);
    System.out.println("Peekin at new tail: " + LL.peekLast());
  }

}//end class
