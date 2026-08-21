import java.lang.*;
import java.util.Stack;

public class validParenthessis {

    public static boolean isValid(String par){
        Stack<Character> s = new Stack<>();
        for(int i = 0 ; i < par.length(); i++){
            if(par.charAt(i) == '(' || par.charAt(i) == '{' || par.charAt(i) == '['){
                s.push(par.charAt(i));
            }else{
                if(par.charAt(i) == ')' && s.peek() != '('){return false;}
                if(par.charAt(i) == ']' && s.peek() != '['){return false;}
                if(par.charAt(i) == '}' && s.peek() != '{'){return false;}

                s.pop();
            }
        }
        if(s.isEmpty()){return true;}
        return false;
    }
    public static void main(String[] args) {
        String par = "({}})";
        System.out.println(isValid(par));

    }
}
