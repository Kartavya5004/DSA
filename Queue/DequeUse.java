package Queue;
import java.util.*;

//deque  double ended queue
//dequeue deletion in queue
//enqueue adding in queue

public class DequeUse {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();  // deque is also an interface just llike queue
        deque.addFirst(1);
        deque.addLast(9);
        deque.removeFirst();
        deque.removeLast();
        deque.peekFirst();
        deque.peekLast();

    }
}
