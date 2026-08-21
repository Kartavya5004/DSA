package college;
import java.util.*;

public class sumMerge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Arr 1 size: ");
        int a = input.nextInt();
        int[] arr1 = new int[a];
        for(int i = 0 ; i < a ; i++){
            arr1[i] = input.nextInt();
        }
        System.out.println("Arr 2 size: ");
        int b = input.nextInt();
        int[] arr2 = new int[b];
        for(int j = 0 ; j < b ; j++ ){
            arr2[j] = input.nextInt();
        }

        // int mid = (a + b)/2;
        // int x = 0, y = 0;
        // for( ; x+y < mid && x < a && y < b ;  ){
        //     if(arr1[x] < arr2[y]){x++; }
        //     else{ y++;}
        // }
        // if(x == a){
        //     while(y < mid-(x-1)){
        //         y++;
        //     }
        // }else{
        //     while(x < mid-(y-1)){
        //         x++;
        //     }
        // }

        // int sum = 0;
        // if(arr1[x] > arr2[y]){sum += arr1[x]; x++;} 
        // else{sum  += arr2[y]; y++;}

        // if(arr1[x] > arr2[y]){sum += arr1[x]; x++;} 
        // else{sum  += arr2[y]; y++;}

        // System.out.println(sum);

        int[] merged = new int[a+b];
        int x = 0, y = 0, z = 0;
        for( ; x < a && y < b ;  ){
            if(arr1[x] < arr2[y]){merged[z]= arr1[x]; z++; x++;}
            else{ merged[z]= arr2[y]; z++; y++;}
        }
        if(x == a){
            while(y < b){
                merged[z]= arr2[y]; z++; y ++;
            }
        }else{
            while(x < a){
                merged[z]= arr1[x]; z++; x++;
            }
        }

        int sum = merged[(a+b)/2] + merged[(a+b)/2 - 1];

        System.out.println("sum = " + sum);;
    }
}
