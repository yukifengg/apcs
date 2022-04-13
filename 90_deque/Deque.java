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

/***
 * interface Deque
 * Includes only methods listed in AP subset of Java
 * (Local version, to override built-in Java implementation.)
 **/

public interface Deque<QUASAR>
{
  //~~~~~~~~~~~~~~~~~~begin AP subset~~~~~~~~~~~~~~~~~~
  /*
  Inserts the specified element into the queue represented by this deque (in
  other words, at the tail of this deque) if it is possible to do so immediately
  without violating capacity restrictions, returning true upon success and
  throwing an IllegalStateException if no space is currently available.
  */
  public boolean add( QUASAR x );

  /*
  Inserts the specified element into the queue represented by this deque
  (at the tail of this deque)
  Returns true if enough space to offer and false if not
  */
  // public boolean offer( QUASAR x );

  /*
  Removes the first occurrence of the specified element from this deque.
  */
  public QUASAR remove();

  /*
  Retrieves and removes the head of the queue represented by this deque (in
  other words, the first element of this deque), or returns null if this deque
  is empty.
  */
  // public QUASAR poll();

  /*
  Retrieves, but does not remove, the head of the queue represented by this deque
  (in other words, the first element of this deque). This method differs from
  peek only in that it throws an exception if this deque is empty.
  */
  // public QUASAR element();

  /*
  Retrieves, but does not remove, the head of the queue represented by this deque
  (in other words, the first element of this deque), or returns null if this
  deque is empty.
  */
  public QUASAR peek();

  //~~~~~~~~~~~~~~~~~~~end AP subset~~~~~~~~~~~~~~~~~~~

}//end interface Deque
