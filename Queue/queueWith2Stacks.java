package Queue;

import java.util.Stack;

public class queueWith2Stacks {
    public static class queue{
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public void add(int n){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(n);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public int pop(){
            return s1.pop();
        }
        public void remove(){
            s1.pop();
            return ;
        }
    }
    public static void main(String[] args) {
        queue q = new queue();


        q.add(2);
    }
}
