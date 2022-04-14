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

/***
 * interface Deque
 * Includes only methods listed in AP subset of Java
 * (Local version, to override built-in Java implementation.)
 **/

public interface Deque<QUASAR>
{
  /*
  Inserts the specified element at the front of this deque if it is possible to
  do so immediately without violating capacity restrictions, throwing an
  IllegalStateException if no space is currently available. When using a
  capacity-restricted deque, it is generally preferable to use method
  offerFirst(E).
  */
  public void addFirst(QUASAR x);

  /*
  Inserts the specified element at the end of this deque if it is possible to do
  so immediately without violating capacity restrictions, throwing an
  IllegalStateException if no space is currently available. When using a
  capacity-restricted deque, it is generally preferable to use method
  offerLast(E).
  */
  public void addLast(QUASAR x);

  /*
  Retrieves and removes the first element of this deque. This method differs
  from pollFirst only in that it throws an exception if this deque is empty.
  */
  public QUASAR removeFirst();

  /*
  Retrieves and removes the last element of this deque. This method differs from
  pollLast only in that it throws an exception if this deque is empty.
  */
  public QUASAR removeLast();

  /*
  Retrieves, but does not remove, the first element of this deque, or returns
  null if this deque is empty.
  */
  public QUASAR peekFirst();

  /*
  Retrieves, but does not remove, the last element of this deque, or returns
  null if this deque is empty.
  */
  public QUASAR peekLast();

  /*
  Inserts the specified element into the queue represented by this deque
  (at the head of this deque)
  Returns true if enough space to offer and false if not
  */
  public boolean offerFirst(QUASAR x);

  /*
  Inserts the specified element into the queue represented by this deque
  (at the tail of this deque)
  Returns true if enough space to offer and false if not
  */
  public boolean offerLast(QUASAR x);

  /*
  Retrieves and removes the head of the queue represented by this deque (in
  other words, the first element of this deque), or returns null if this deque
  is empty.
  */
  public QUASAR pollFirst();

  /*
  Retrieves and removes the tail of the queue represented by this deque (in
  other words, the first element of this deque), or returns null if this deque
  is empty.
  */
  public QUASAR pollLast();

  /*
  Retrieves, but does not remove, the head of the queue represented by this deque
  (in other words, the first element of this deque). This method differs from
  peek only in that it throws an exception if this deque is empty.
  */
  public QUASAR element();

}//end interface Deque
