package college;

import java.util.Scanner;

public class maxSubSum {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("enter arr size: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("enter arr element");
        for(int i = 0 ; i< n; i++){
            arr[i] = input.nextInt();
        }

        int sum = arr[0];
        int start = 0;
        for(int i = 0 ; i < n ; ){
            if(arr[i] > sum){start = i;  }

        }
    }

}
