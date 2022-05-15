public class ArrayPriorityQueue<T> implements PriorityQueue<T>{
    private ArrayList<T> queue;



    public ArrayPriorityQueue() {
        queue = new ArrayList<T>();
    }


    //O(1)
    public void add( T x ) {
        queue.add(x, 0);
    }

    //O(1)
    public boolean isEmpty() {
        return queue.size() == 0;
    }

    //O(n)
    public T peekMin() {
        T min = queue.get(0);

        for (T a : queue) {
            if (a <= min) {min = a;}
        }

        return min;
    }

    //O(n)
    public T removeMin() {
        T min = queue.get(0);

        for (T a : queue) {
            if (a <= min) {min = a;}
        }

        queue.remove(min);
        return min;
    }
}
