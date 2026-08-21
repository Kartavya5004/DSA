package college;

import java.util.Arrays;
import java.util.Scanner;

public class rearrangeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter arr size: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("enter arr element");
        for(int i = 0 ; i< n; i++){
            arr[i] = input.nextInt();
        }

        // int[] ordered = arr.clone();

        Arrays.sort(arr);

        for(int i = 0 ; i < n / 2 ; i++){
            System.out.print(arr[i]);
            System.out.print(arr[n - i]);
        }
        
        if(1 == n%2){System.out.print(arr[(n/2)+1]);}



    }
}
