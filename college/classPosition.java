package college;
import java.lang.*;
import java.util.Scanner;
import java.util.Arrays;

public class classPosition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter arr size: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = input.nextInt();
        }
        int[] arrNew = arr.clone();
        Arrays.sort(arrNew);

        for(int j = n-1; j >= 0 ; j--){
            
        }

    }
}
