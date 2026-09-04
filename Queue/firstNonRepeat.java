package Queue;
import java.util.*;

public class firstNonRepeat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        // int n = input.nextInt();
        // int[] arr = new int[n];
        // for(int i = 0; i< n ;i++){
        //     arr[i] = input.nextInt();
        // }

        String str = input.next();

        Queue<Character> q = new LinkedList<>();
        ArrayList<Character> al = new ArrayList<>();
        HashMap<Character , Integer> h = new HashMap<>();


        for(char x : str.toLowerCase().toCharArray()){
            h.put(x , h.getOrDefault(x, 0) + 1);
            if(1 == h.get(x)){q.add(x);}
            else if(q.contains(x)){q.remove(x);}
           



            if(q.size() == 0){al.add('\0');}
            else{al.add(q.peek());}
        }

        System.out.println(al);


    }
    
}
