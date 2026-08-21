import java.util.*;
public class powOf2 {
    public boolean isPower(int n){
        int temp =n-1;
        if(0 == (temp & n)){return true;}
        return false;
    }

    public static void main(String[] args) {
        powOf2 pow  = new powOf2();
        System.out.println(pow.isPower(63));
    }
}
