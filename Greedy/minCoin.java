package Greedy;
import java.util.*;

public class minCoin {
    public static void main(String[] args) {
        int[] coin = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        int target = 591;
        int count = 0;

        for(int i = 0 ; i < coin.length ; i++){
            if(target >= coin[i]){
                count++;
                target -= coin[i];
                i--;
            }
        }

        System.out.println(count);
    }
   
    
}
