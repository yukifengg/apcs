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

// tester file
import java.util.LinkedList;
import java.util.ArrayList;

public class MRKPirateBae<QUASAR> implements Deque<QUASAR> {
  public void addFirst(QUASAR x)
  {
    list.addFirst(x);
  }

  public void addLast(QUASAR x)
  {
    list.addLast(x);
  }

  public QUASAR removeFirst()
  {
    return list.removeFirst();
  }

  public QUASAR removeLast()
  {
    return list.removeLast();
  }

  public QUASAR peekFirst()
  {
    return list.peekFirst();
  }

  public QUASAR peekLast()
  {
    return list.peekLast();
  }

  public boolean offerFirst(QUASAR x)
  {
    return list.offerFirst(x);
  }

  public boolean offerLast(QUASAR x)
  {
    return list.offerLast(x);
  }

  public QUASAR pollFirst()
  {
    return list.pollFirst();
  }

  public QUASAR pollLast()
  {
    return list.pollLast();
  }

  public QUASAR element()
  {
    return list.element();
  }

  private LinkedList<QUASAR> list;
  // private ArrayList<QUASAR> AList;

  public static void main(String[] args) {
    System.out.println("-------------------Testing out LinkedList-------------------");
    LLDeque LL = new LLDeque();
    System.out.println("Testing addFirst: 0 then 1");
    LL.addFirst(0);
    LL.addFirst(1);
    System.out.println(LL);
    System.out.println("Testing addLast: 2 then 3");
    LL.addLast(2);
    LL.addLast(3);
    System.out.println(LL);
    System.out.println("filled LL: " + LL);
    System.out.println("Testing removeLast");
    LL.removeLast();
    System.out.println("removed tail: " + LL);
    System.out.println("Testing removeFirst");
    LL.removeFirst();
    System.out.println("removed head: " + LL);
    System.out.println("peekFirst at new head: " + LL.peekFirst());
    System.out.println("peekLast at new tail: " + LL.peekLast());
    System.out.println("Testing offerFirst: 4");
    LL.offerFirst(4);
    System.out.println(LL);
    System.out.println("Testing offerLast: 5");
    LL.offerLast(5);
    System.out.println(LL);
    System.out.println("Testing pollFirst");
    LL.pollFirst();
    System.out.println(LL);
    System.out.println("Testing pollLast");
    LL.pollLast();
    System.out.println(LL);
    System.out.println("Testing element");
    System.out.println(LL.element());

    // MRKPirateBae Al = new ALDeque();
    // Al.add(1);
    // Al.add(2);
    // Al.add(3);
    // System.out.println("filled Al: " + Al);
    // Al.remove();
    // System.out.println("removed head: " + Al);
    // System.out.println("Peekin at new head: " + Al.peek());
  }
}
