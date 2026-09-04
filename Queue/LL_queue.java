package Queue;

public class LL_queue {
    static class node{
        int val;
        node next;
        node(int val){
            this.val = val;
            this.next = null;
        }
    }

    public static class queue{
        node head = new node(-1);
        node temp = head;

        public boolean isempty(){
            return head.next == null;

        }

        // public static void add(int data){
        //     if(isEmpty())
        // }
        public void add(int n){
            temp.next = new node(n);
            temp = temp.next;
            System.out.println("Added");
            return;
        }
        public int pop(){
            
            if(isempty()){
                System.out.println("queue is empty");
                return -1;
            }
            int val = head.next.val;
            head.next = head.next.next;
            return val;
        }
        public void traverse(){
            node t = head.next;
            while(t != null){
                System.out.print(t.val + " ");
                t = t.next;
            }
            return;
        }
        public int peek(){
            if(isempty()){System.out.println("emptyyyy!!"); return -1;}
            return head.next.val;
        }
    }

    public static void main(String[] args) {
        queue q = new queue();
        q.add(5);
        q.add(65);
        q.add(85);
        q.add(95);

        System.out.println(q.isempty());
        System.out.println(q.head.val);
        System.out.println(q.pop());
        q.traverse();



    }
}
