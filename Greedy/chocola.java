package Greedy;
import java.util.*;

public class chocola {
    public static void main(String[] args) {
        Integer[] vcut = {2,1,3,1,4};
        Integer[] hcut = { 4,1,2};


        Arrays.sort(vcut , Collections.reverseOrder() );
        Arrays.sort(hcut , Collections.reverseOrder());

        int cost = 0;

        for(int i = 0 ,j =0  ; i < vcut.length || j < hcut.length;  ){
            if( i < vcut.length && j < hcut.length && vcut[i] > hcut[j]){
                cost +=  vcut[i] * (j+1); 
                i++;
            }else if( i < vcut.length && j < hcut.length && vcut[i] <= hcut[j]){
                cost +=  hcut[j] * (i+1); 
                j++;
            }else if(i == vcut.length ){
                cost +=  hcut[j] * (i+1); 
                j++;
            }else{
                cost +=  vcut[i] * (j+1); 
                i++;
            }
        }

        System.out.println(cost);


    }
}
