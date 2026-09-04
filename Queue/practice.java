package Queue;
import java.util.*;

public class practice {
    public static void binaryNunbers(int n){
        Queue<String> q  = new LinkedList<>();
        q.add("1");
        while(n-- > 0){
            String s1 = q.peek();
            q.remove(s1);
            System.out.println(s1);
            String s2 = s1;
            q.add(s1 + "0");
            q.add(s2 + "1");
        }

        System.out.println(q);
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(3);
        binaryNunbers(10);
        
    }
}



/*

Question 1 :Generate Binary Numbers Given a number N.
The task is to generate and print all binary numbers with decimal values from 1 to N.
Sample Input 1: N = 2
Sample Output 1: 1 10
Sample Input 2: 5.
Sample Output 2: 1 10 11 100 101

Question 2 :Connect n ropes with minimum cost 
Given are N ropes of different lengths,the task is to connect these ropes in to one rope with minimum cost, such that the cost to connect two ropes is equal to the sum of their lengths.
Sample Input 1: N = 4, arr = [4 3 2 6]
Sample Output 1: 29
Sample Input 2: N = 2, arr = [1 2 3]
Sample Output 2: 9

Question 3 :Job Sequencing Problem
We have an array ofjobs where every job has a deadline and associated profit if the job is finished before the deadline.
It is also given that every job takes a single unit of time, so them in imum possible deadline for any job is 1. Maximize the total profit if only one job can be scheduled at a time.
Sample Input 1:JobID  Deadline  Profit 
                a        4        20  
                b        1        10  
                c        1        40  
                d        1        30
Sample Output 1: c,a 

Question 4 :Reversing the first K elements of a Queue
We have an integer k and a queue of integers, we need to reverse the order of the first k elements of the queue, leaving the other elements in the same relative order.
Sample Input 1:Q = [10, 20, 30, 40, 50, 60, 70,80, 90, 100] , k=5
Sample Output 1: Q = [50, 40, 30, 20, 10, 60, 70,80, 90, 100]

Question 5 :Maximum of all subarrays of size k
We have an array arr[] of size N and an integer K. Find the maximum for each and every contiguous subarray of size K.
Sample Input 1: N=9, K=3 arr= 1 2 3 1 4 5 2 3 6
Sample Output 1: 3 3 4 5 5 5 6

*/  