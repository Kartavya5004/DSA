import java.util.*;

public class adding1 {
    public int add(int n){
        int i = 0;
        while (true) {
            n = n ^ (1 << i);
            if(0 == (n ^ (1<<i))){
                return n;
            }
            i++;
        }
    }
    public static void main(String[] args) {
        adding1 update = new adding1();
        System.out.println(update.add(70));
    }
}
