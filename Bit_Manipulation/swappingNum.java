import java.util.*;

public class swappingNum {
    public void swap(int a, int b){
        int i = 0;
        while(a > (1 << i) || b > (1 << i)){
            if((0 != (a & (1 << i))) == (0 != (b & (1 << i)) )){
            }else{
                a = a ^ (1 << i);
                b = b ^ (1 << i);
            }
            i++;
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        return;
    }
    public static void main(String[] args) {
        swappingNum swap =  new swappingNum();
        swap.swap(85, 62);
    }
}
  