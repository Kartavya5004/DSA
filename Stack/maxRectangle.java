import java.util.*;

public class maxRectangle {
    public static void nextSmallLeft(int[] nsl, int[] arr){
        Stack<Integer> s = new Stack<>();
        for(int i = 0 ; i < arr.length ; i++){
            if(s.isEmpty()){s.push(i);nsl[i] = -1;}
            else if(arr[s.peek()] >= arr[i]){s.pop();i--;}
            else{nsl[i] = s.peek(); s.push(i); }
        }
    }

    public static void nextSmallRight(int[] nsr, int[] arr){
        Stack<Integer> s = new Stack<>();
        for(int i = arr.length - 1 ; i >= 0 ; i--){
            if(s.isEmpty()){s.push(i);nsr[i] = arr.length;}
            else if(arr[s.peek()] >= arr[i]){s.pop();i++;}
            else{nsr[i] = s.peek(); s.push(i); }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3 };
        int[] nsl = new int[6];
        int[] nsr = new int[6];
        nextSmallLeft(nsl, arr);
        nextSmallRight(nsr, arr);

        int maxArea = 0;

        for(int i = 0 ; i < arr.length; i++){
            int area =(nsr[i] - nsl[i])-1;
            area *= arr[i];
            maxArea = Math.max(maxArea, area);
        }

        
        System.out.println(maxArea);

        
    }
}
