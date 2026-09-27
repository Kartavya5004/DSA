package Greedy;
import java.util.*;

public class maxLenChain {
    public static void main(String[] args) {
        int[][]  arr = {{5 , 24} , {39,60} , {5, 28} , {27 , 40} , {50 ,90}};

        Arrays.sort(arr , (a , b) -> Integer.compare(a[1] , b[1]));

        int count = 0;
        int end = 0;

        count = 1;
        end = arr[0][1];

        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i][0] >= end){
                count++;
                end = arr[i][1];
            }
        }

        System.out.println(count);
    }
}
