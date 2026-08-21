import java.util.*;
public class nextGreaterele {
    public static void next(int[] arr , int[] res){
        Stack<Integer> s = new Stack<>();
        int n = arr.length;
        for(int i = n-1; i >= 0; i--){
            while(!s.isEmpty()){
                if(s.peek() > arr[i]){
                    res[i] = s.peek();
                    s.push(arr[i]);
                    break;
                }else{
                    s.pop();
                }
            }
            if(s.isEmpty()){
                res[i] = -1;
                s.push(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {6 , 8 , 0, 1, 3};
        int[] res = new int[5];

        next(arr , res);

        for(int x : res){
            System.out.println(x);
        }
    }
}
