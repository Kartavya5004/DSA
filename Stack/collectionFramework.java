import java.util.Stack;

public class collectionFramework {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        if(s.isEmpty()){System.out.println("Empty stack");}
        s.push(5);
        s.push(55);
        s.push(465);
        s.push(3633);

        // if(s.isEmpty()){System.out.println("Empty stack");}vvikas singh rayhore
        s.elements();
        

        System.out.println();
        System.out.println(s.pop());
        System.out.println(s.pop());

        
    }
}
