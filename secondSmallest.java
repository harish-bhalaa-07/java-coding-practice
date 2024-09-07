import java.io.*;
import java.util.*;

public class secondSmallest {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        int firstMin = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        int num = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            if(a[i] < firstMin){
                secondMin = firstMin;
                firstMin = a[i];
            }
            else if(a[i] < secondMin && a[i]!=firstMin){
                secondMin = a[i];
            }
            
        }
        System.out.println(secondMin);
        
    }
}