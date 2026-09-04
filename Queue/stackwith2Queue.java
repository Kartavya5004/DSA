package Queue;

import java.util.*;

public class stackwith2Queue {
    public static class Stack{
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public void add(int n ){
            if(q1.isEmpty()){q2.add(n);}
            else{q1.add(n);}
            System.out.println("Element added");
            return ;
        }

        public int remove(){
            int temp;
            if(q1.isEmpty() && q2.isEmpty()){
                System.out.println("Empty stack");
            }
            q1.addAll(q2);
            q2.clear();
            do{
                temp = q1.remove();
                //System.out.println(temp);
            }while(!q1.isEmpty());

            return temp;
        }

    }
    
    public static void main(String[] args) {
        Stack s = new Stack();
        s.add(2);
        s.add(38);
        System.out.println(s.remove());
    }
}
