import java.util.*;
public class bitOperator{

    public boolean isOdd(int n){

        if(1 == (n & 1) ){return true;}   // 1 is the bitMask
        return false ;
    }

    public int getIthBit(int n , int i){
        int bitMask = 1 << i;
        if(0 != (n & bitMask)){return 1;}
        return 0;
    }

    public int alterIthBit(int n , int i){
        int bitMask = 1 << i;
        return bitMask^n;
    }

    public int clearLastiBit(int n , int i){
        int bitMask = ~0;
        bitMask <<= i;
        return n & bitMask;
    }

    public int clearRange(int n , int i , int j){ // j > i
        int bitMask = ~0;
        bitMask <<= (j-i);
        bitMask = (~bitMask) << i;
        return n & (~bitMask);
    }



    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        System.out.println(a & b);
        bitOperator bit = new bitOperator();

        System.out.println(bit.isOdd(6));
   
        System.out.println(bit.getIthBit(3, 1));

        System.out.println(bit.clearLastiBit(31, 2));

        System.out.println(bit.clearRange(31, 2 , 4));

        
        return;
    }
}