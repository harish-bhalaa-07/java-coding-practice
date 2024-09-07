import java.io.*;
import java.util.*;

public class primePair {

    public static boolean isPrime(int n){
        int flag = 0;
        for(int i=2; i<=n/2; i++){
            if(n%i == 0){
                flag = 1;
            }
        }
        if(flag == 0){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =2; i<=n; i++){
            for(int j =i+1; j<=n; j++){
                if(isPrime(i) && isPrime(j) && isPrime(i+j)){
                    System.out.println(i+" "+j);
                }
            }
        }
        
    }
}