import java.util.*;

public class bottomPush {
    static Stack<Integer> s = new Stack<>();

    static void adding(int n){
        int val;
        if(s.isEmpty()){
            s.push(n);
        }else{
            val = s.pop();
            adding(n);
            s.push(val);
        }
       
        return;
    }
    public static void main(String[] args) {
        s.push(5);
        s.push(15);
        s.push(15);
        s.push(25);

        adding(-5);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
        
    }
}
