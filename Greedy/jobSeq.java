package Greedy;
import java.util.*;

public class jobSeq {
    static class  Job{
        int deadLine;
        int profit;
        int id;
        public Job(int i ,int j, int k){
            deadLine = i;
            profit = j;
            id = k;
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{4,20 }, {1,10 } , {1,40}, {1 ,30 }};

        Arrays.sort(arr , (a,b)-> Integer.compare(b[1], a[1]));

        Arrays.sort(arr , (a,b)-> Integer.compare(a[0] , b[0]));

        int curr = 0;
        int profit = 0;
        
        ArrayList<Integer> al = new ArrayList<>();

        for(int i = 0 ; i  <arr.length ; i++){
            if(curr < arr[i][0]){
                curr++;
                profit += arr[i][1];
                al.add(arr[i][2]);
            }
        }

        System.out.println(profit);
        System.out.println(al);


        //-------------------------------------------------------

        // ArrayList<Job> jobs = new ArrayList<>();

        // for(int i = 0 ; i < arr.length ; i++){
        //     jobs.add(new Job(arr[i][0] , arr[i][1] , i));
        // }

        // Collections.sort(jobs , (obj1 , obj2)-> obj2.profit - obj1.profit);

    }
}
