package Queue;
import java.util.*;

public class interleave2half {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> org = new LinkedList<>();

        for(int i = 0 ; i < n/2;i++){
            q1.add(arr[i]);
        }

        for(int i = n/2 ; i < n ; i++){
            org.add(arr[i]);
        }

        while(!q1.isEmpty()){
            org.add(q1.remove());
            org.add(org.remove());
        }

        System.out.println(org);


    }
}
