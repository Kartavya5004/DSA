package college;

import java.util.Scanner;
import java.util.*;

public class HeightChecker {
    public static void main(String[] args) {
        
    
        Scanner input = new Scanner(System.in);
        System.out.println("enter arr size: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("enter arr element");
        for(int i = 0 ; i< n; i++){
            arr[i] = input.nextInt();
        }

        int[] ordered = arr.clone();

        Arrays.sort(ordered);

        int count = 0;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] != ordered[i]){count++;}
        }

        System.out.println("fault = " + count);
    
    }

}
