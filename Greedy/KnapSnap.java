package Greedy;

import java.util.*;

public class KnapSnap{
    public static void main(String[] args) {
        int[] val = {60, 100, 120};
        int[] item = {10 , 20 ,30};
        int maxCap = 50;
        
        double[][] arr = new double[3][3];


        for(int i = 0 ; i < 3 ; i++){
            arr[i][0] = val[i];
            arr[i][1] = item[i];
            arr[i][2] = (double)val[i]/item[i];
        }

        Arrays.sort(arr , (a , b) -> Double.compare(b[2] , a[2]) );

        int profit = 0;
        for(int i = 0 ; i < 3 ;i++){
            if(arr[i][1] < maxCap){
                maxCap -= arr[i][1];
                profit += arr[i][0];
            }else{
                profit += arr[i][2]*maxCap;
                break;
            }
        }


        System.out.println(profit);

    }
}