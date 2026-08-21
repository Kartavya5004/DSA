import java.util.Stack;

public class reversingStack {

    public static void revStack(Stack<Integer> s){
        if(s.isEmpty()){return;}

        int val = s.pop();
        revStack(s);
        s.push(val);
        return;
    }
    static void adding(Stack<Integer> s , int n){
        int val;
        if(s.isEmpty()){
            s.push(n);
        }else{
            val = s.pop();
            adding(s ,n);
            s.push(val);
        }
       
        return;
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        revStack(s);

        
    }
}
