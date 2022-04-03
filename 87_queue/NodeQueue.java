// Team Acid: Yuki Feng, Tasnim Chowdhury, Faiyaz Rafee
// APCS pd08
// HW 87: The English Do Not Wait In Line for Soup
// 2022-04-01
// time spent: 0.5 hrs
import java.util.*;

public class NodeQueue<QUASAR> implements Queue<QUASAR>{
    private int size;
    private Node<QUASAR> front;
    private Node<QUASAR> back;

    public NodeQueue() {
        front = null;
        back = null;
        size = 0;
    }

    public NodeQueue(QUASAR cargo) {
        front = back = new Node<QUASAR>(cargo);
    }

    //means of removing an element from collection:
    //Dequeues and returns the first element of the queue.
    public QUASAR dequeue() {
        if ( isEmpty() ) {
          throw new NoSuchElementException();
        }
        QUASAR og = front.getCargo();
        front = front.getNext();
        size--;
        return og;
    }

    //means of adding an element to collection:
    //Enqueue an element onto the back of this queue.
    public void enqueue( QUASAR x ) {
        Node<QUASAR> _oldBack = back;
        back = new Node<QUASAR>(x);
        if ( isEmpty() ) {
          front = back;
        }
        else {
          _oldBack.setNext(back);
          size++;
        }
    }

    //Returns true if this queue is empty, otherwise returns false.
    public boolean isEmpty() {
        return front == null;
    }

    //Returns the size
    public int size(){
        return size;
    }

    //Returns the first element of the queue without dequeuing it.
    public QUASAR peekFront(){
        if( isEmpty() ) {
          return null;
        }
        return front.getCargo();
    }

    private class Node<QUASAR> {
        //instance vars
        private QUASAR cargo;
        private Node<QUASAR> cdr;

        // constructor
        public Node( QUASAR value, Node<QUASAR> next ){
            this.cargo = value;
            this.cdr = next;

        }

        public Node( QUASAR cargo) {
            this.cargo = cargo;
            this.cdr = null;
        }


        //--------------v  ACCESSORS  v--------------
        public QUASAR getCargo(){
            return this.cargo;
        }

        public Node<QUASAR> getNext(){
            return this.cdr;
        }
        //--------------^  ACCESSORS  ^--------------


        //--------------v  MUTATORS  v--------------
        public QUASAR setCargo( QUASAR newCargo ) {
            QUASAR temp = this.cargo;
            this.cargo = newCargo;
            return temp;
        }

        public Node<QUASAR> setNext( Node<QUASAR> newNext ) {
            Node<QUASAR> temp = this.cdr;
            this.cdr = newNext;
            return temp;
        }
        //--------------^  MUTATORS  ^--------------


        // override inherited toString
        public String toString() {
          return cargo.toString();
        }
    }

    public static void main(String[] args){
        NodeQueue<Integer> qq = new NodeQueue<Integer>(5);
        for(int i = 10; i < 100; i+= 10)
          qq.enqueue(i);
        while(!qq.isEmpty()){
            System.out.println(qq.dequeue());
        }
    }
}
