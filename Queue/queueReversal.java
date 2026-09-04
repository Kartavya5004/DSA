package Queue;
import java.util.*;

public class queueReversal {
    public static void rev(Queue<Integer> q){
        if(q.isEmpty()){return;}
        int temp = q.remove();
        rev(q);
        q.add(temp);

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Queue<Integer> q = new LinkedList<>();

        for(int x : arr){
            q.add(x);
        }

        rev(q);
        System.out.println(q);
    }
}
