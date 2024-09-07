
import java.io.*;
import java.util.*;

public class candy {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        
        for(int i =0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int candy[] = new int[n];
        
        for(int i=0; i<n; i++){
            candy[i] = 1;
            
            if(i==0){
                if(a[i]>a[i+1]){
                    candy[i]++;
                }
            }
            else if(i == n-1){
                if(a[i]>a[i-1]){
                    candy[i]++;
                }
            }
            else{
                if(a[i]>a[i-1] || a[i]>a[i+1]){
                    candy[i]++;
                }
            }
        }
        int sum=0;
        for(int i=0; i<n; i++){
            sum += candy[i];
        }
        System.out.println(sum);
        
    }
}