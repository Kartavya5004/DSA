import java.util.*;

public class duplicateParenthesis {
    public static boolean ifDuplicate(String res){
        Stack<Character> s = new Stack<>();
        for(int i = 0 ; i < res.length(); i++){
            if(res.charAt(i) != ')'){s.push(res.charAt(i));}
            else{
                if(s.peek() == '('){return true;}
                do{
                    s.pop();
                }while(s.peek() != '(');
            } 
        }
        return false;
    }
    public static void main(String[] args) {
        String res = "(((a+b)+c)+d)";
        System.out.println(ifDuplicate(res));
         
    }
}
