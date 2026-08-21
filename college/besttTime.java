package college;

import java.util.Scanner;

public class besttTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter arr size: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("enter arr element");
        for(int i = 0 ; i< n; i++){
            arr[i] = input.nextInt();
        }

        // int buy= arr[0]
        int profit = 0;

        for(int i = 0 ; i< n-1 ; i++){
            if(arr[i] >= arr[i+1]){continue;}
            else{
                for(int j= i+1 ; j < n; j++ ){
                    if(arr[j] > arr[i]){profit = Math.max(profit, arr[j] - arr[i]);}
                }
            }

        }


        System.out.println("max profit = " + profit);

    }
}
