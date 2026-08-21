package college;

import java.util.Scanner;

public class majoritEle {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("enter arr size: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("enter arr element");
        for(int i = 0 ; i< n; i++){
            arr[i] = input.nextInt();
        }


        // if(arr[n/2] == arr[0]  || arr[n/2] == arr[n-1]  ){System.out.print(arr[n/2]);}
        int j;
        for(int i = 0 ; i < n ;){
            for(j = i + 1 ; j < n ; j++){
                if(arr[i] == arr[j]){}
                else{ break;}
                
                if( j - i > (n/2)){System.out.print(arr[i]); return;}
            }
            i=j;
        }
        

    }
}
