import java.io.*;
import java.util.*;

public class Automorphic {
    
    public static boolean isAutomorphic(int n){
        int square = n*n;
        while(n>0){
            if(n%10 != square%10){
                return false;
            }
            n /= 10;
            square /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(isAutomorphic(n)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        
    }
}