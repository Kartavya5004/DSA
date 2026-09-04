package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

import Queue.LL_queue.queue;

public class JCFqueue {
    public static void main(String[] args) {
        // JCF java collection framework
    
        /* 
        LinkedList: Standard FIFO queue based on linked nodes. 
            It allows null values but should generally be avoided if performance is a bottleneck.
        ArrayDeque: A resizable array implementation of the Deque (Double-Ended Queue) interface. 
            It is faster and more memory-efficient than LinkedList for queue operations and does not allow null elements.
        PriorityQueue: An elements-by-priority queue. 
            Elements are ordered by their natural order or a custom comparator, completely disregarding insertion order.
        LinkedBlockingQueue / ArrayBlockingQueue: Thread-safe implementations from the java.util.concurrent package, 
            ideal for producer-consumer multi-threaded applications.
            
        */

        //queue is an interface so , uuska apna koi object nhi bn skta isiliye woh ll aur array ka use prta hai at the time of implementation 

        Queue<Integer> ll = new LinkedList<>();
        Queue<Integer> ad = new ArrayDeque<>();
        Queue<Integer> pq = new PriorityQueue<>();
        Queue<Integer> lbq = new LinkedBlockingDeque<>();
        Queue<Integer> abq = new ArrayBlockingQueue<>(0);

        // add, rempve , peek 

    }
}
