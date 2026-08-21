import java.util.Stack;

public class reversingString {

    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        String str = new String();
        str = "abc";

        for(int i = 0; i < str.length(); i++ ){
            s.push(str.charAt(i));
        }

        StringBuilder out = new StringBuilder("");
        while(!s.isEmpty()){
            out.append(s.pop());
        }

        String outString = out.toString();
        System.out.println(outString);
    }
}
