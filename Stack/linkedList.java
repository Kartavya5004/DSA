import java.util.*;

public class linkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class stack{
        public  Node head = null;

        public  boolean isEmpty(){
            if(head == null){return true;}
            return false;
        }

        public int peek(){
            if(isEmpty()){System.out.println("Stack is empty...."); return -1;}
            
            return head.data;
        }

        public void push(int val){
            Node newNode = new Node(val);        
            newNode.next = head;
            head = newNode;

            System.out.println("Node added....");
            return;
        }

        public int pop(){
            if(head == null){System.out.println("Nothing to pop..."); return -1;}
            
            Node temp = head;
            head = head.next;
            // temp.next = null;

            return temp.data;
            
        }

        public void traverse(){
            Node temp = head;

            while(temp != null){
                System.out.print(temp.data + ", ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        stack s = new stack();

        if(s.isEmpty()){System.out.println("Empty stack");}
        s.push(5);
        s.push(55);
        s.push(465);
        s.push(3633);

        // if(s.isEmpty()){System.out.println("Empty stack");}vvikas singh rayhore
        s.traverse();

        System.out.println();
        System.out.println(s.pop());
        System.out.println(s.pop());

        s.traverse();
        
    }
}




