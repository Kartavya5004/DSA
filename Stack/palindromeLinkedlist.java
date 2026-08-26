import java.util.*;

class Node{
    int val;
    Node next;
    Node (int val){
        this.next = null;
        this.val = val;
    }

}
public class palindromeLinkedlist {
    public static boolean isPalindrome(Node head){
        if(head == null || head.next == null){return true;}
        int count = 0;
        Node temp = head;
        while(temp.next != null){
            count++;
            temp = temp.next;
        }
        boolean even = false;
        if(0 == count%2){even = true;}
        count /= 2;
        Stack<Integer> s = new Stack<>();
        while(count-- != 0){

            System.out.println(head.val);
            s.push(head.val);
            head = head.next;
            
        }
        if(!even){
            head = head.next;

        }
        System.out.println(head.val);

        while(head != null){
            System.out.println(head.val);
            if(s.peek() == head.val){s.pop(); head = head.next;}
            else{return false;}
        }


        return true;
    }
    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(3);
        Node six = new Node(2);
        Node seven = new Node(1);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;

        System.out.println(isPalindrome(one)) ;
        
    }
}
