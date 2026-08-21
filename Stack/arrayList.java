import java.util.*;

public class arrayList {
    static class stack{   // static mean that the member belong to the class itself rather then to individual object
        ArrayList<Integer> arr = new ArrayList<>();

        
        public boolean isEmpty(){
            return 0 == arr.size();
        }
        
        public void push(int val){
            arr.add(val);
            return;
        }
        public int pop(){

            if(!isEmpty()){int top = arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            return top;}
            System.out.println("Nothing to Pop!!");
            return -1;
        }
        public int peek(){
            if(isEmpty()){return -1;}
            return arr.get(arr.size()-1);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(5);
        int top = s.peek();


    }
}
