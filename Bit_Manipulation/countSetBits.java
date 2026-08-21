import java.util.*;

public class countSetBits {

    public int countBit(int n){
        int count = 0;
        while(0 != n){
            if(1 == (n&1)){count++;}
            n = (n >> 1);
        }
        return count;
    }
    public static void main(String[] args) {
        countSetBits count = new countSetBits();
        System.out.println(count.countBit(13));
        return ;
    }
}
