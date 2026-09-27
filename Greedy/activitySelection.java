package Greedy;

import java.util.Scanner;

public class activitySelection {
    public static int maxPossible(int[] start , int[] end){
        int count = 0;
        int n = start.length;
        int temp = -1;
        for(int i = 0 ; i< n ; i++){
            if(start[i] >= temp){count++; temp = end[i];}

        }
        return count;
    }



    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];
        System.out.println("Enter start: ");
        for(int i = 0 ; i< n ; i++){
            start[i] = input.nextInt();
        }
        System.out.println();
        System.out.println("Enter end: ");
        for(int i = 0; i< n ; i++){
            end[i] = input.nextInt();
        }
       
        int maxAct = 0;
        int endPos = 0;

        // case 1 : end time sorted
        maxAct = 1;
        endPos = end[0];

        for(int i = 1 ; i < end.length ; i++){
            if(start[i] >= endPos){
                maxAct++;
                endPos = end[i];
            }
        }

        System.out.println(maxPossible(start, end));


    }
}
