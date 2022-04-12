// Team Acid: Yuki Feng, Tasnim Chowdhury, Faiyaz Rafee
// APCS pd08
// HW89: Queue Two Ways
// 2022-04-11
// time spent: 0.5 hrs

/*
DISCO:
- the difference between linked list and arraylist queues is that LL uses peek()
and addLast() for peekFront whereas AL uses get() and add(), respectively.

QCC:
- which is faster? AL or LL?
*/

/***
 * interface Queue
 * Includes only methods listed in AP subset of Java
 * (Local version, to override built-in Java implementation.)
 **/

public interface Queue<QUASAR>
{
  //~~~~~~~~~~~~~~~~~~begin AP subset~~~~~~~~~~~~~~~~~~
  //means of removing an element from collection:
  //Dequeues and returns the first element of the queue.
  public QUASAR dequeue();

  //means of adding an element to collection:
  //Enqueue an element onto the back of this queue.
  public void enqueue( QUASAR x );

  //Returns true if this queue is empty, otherwise returns false.
  public boolean isEmpty();

  //Returns the first element of the queue without dequeuing it.
  public QUASAR peekFront();
  //~~~~~~~~~~~~~~~~~~~end AP subset~~~~~~~~~~~~~~~~~~~

}//end interface Queue
