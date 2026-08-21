import java.util.*;
public class stockProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] stock = {100 , 80 , 60, 70, 60, 85, 100};

        int[] span = new int[stock.length];

        Stack<Integer> s = new Stack<>();
        for(int i = 0 ; i< stock.length ; i ++){
            

            while(!s.isEmpty()){
                if(stock[s.peek()] <= stock[i]){
                    s.pop();
                }
                else{
                    span[i] = i - s.peek();
                    s.push(i);
                    break;
                }
            }
            if(s.isEmpty()){
                s.push(i);
                span[i] = i + 1 ;

                continue;
            }
        }

        for(int x : span){
            System.out.println(x);
        }

    }
}
