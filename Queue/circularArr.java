package Queue;

public class circularArr {
    
    static int MAX ;
    static class Queue{
        static int rear ;
        static int front ;
        static int[] arr;

        Queue(int n){
            arr = new int[n];
            rear = 0;
            front = 0;
            MAX = n;
        }

        public static boolean isEmpty(){
            return front == rear ;
        }

        public static boolean isFull(){
            return (rear+1) % MAX == front;
        }
        public static void push(int n){
            if(isFull() ){
                System.out.println("Queue is full !!");
                return;
            }  
            arr[rear] = n;
            rear = (rear+1) % MAX;
        }
        public static void remove(){
            if(isEmpty()){
                System.out.println("nothing to pop!!");
                return;
            }
            front = (front + 1) % MAX;
            System.out.println("Removed");
            return ;
        }
        public static int pop(){
            if(isEmpty()){
                System.out.println("nothing to pop");
                return -1;
            }

            int out = arr[front];
            front = (front +1)% MAX;
            return out;
        }
        
    }

    public static void main(String[] args) {
        Queue q = new Queue(10);
        q.push(35);
        q.push(350);
        q.push(3500);
        q.push(35001);
        

        //q.push(39);

        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());


    }
    
}
