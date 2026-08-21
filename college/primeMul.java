
package college;
import java.util.*;

public class primeMul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter input size: ");
        int n = input.nextInt();
        int prime = 2;
        int a = -1, b =-1;
        for(int i = 0; i<n ; i++){
            if(a == -1){
                for(int j = 2;j < prime;j++){
                    if(0 == prime % j){prime++; j = 1;}
                }
                a = prime;
                prime++;
                System.out.print(a + " " );continue;
            }
            if(b == -1){
                for(int k = 2;k < prime;k++){
                    if(0 == prime % k){prime++; k = 1;}
                }
                b = prime;
                prime++;
                
                System.out.print(b + " " );continue;
            }
            System.out.print( a * b + " ");
            a = -1;
            b = -1;
        }
        return;
    }
}
