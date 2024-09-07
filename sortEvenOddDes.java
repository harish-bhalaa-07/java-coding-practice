import java.io.*;
import java.util.*;

public class sortEvenOddDes {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        
        int oddCount=0, evenCount=0;
        for(int i=0; i<n; i++){
            if(a[i] % 2 ==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        
        for(int i = 0; i < n; i++) {
            // Check for out-of-bound indices and correct logic
            if(i > 0 && i < n - 1) {
                if(a[i] % 2 == 0 && (a[i-1] % 2 != 0 || a[i+1] % 2 != 0)) {
                    int temp = a[i];
                    a[i] = a[i-1];
                    a[i-1] = temp;
                }
            }
            else if(i == 0 && a.length > 1) {
                // Special case for the first element
                if(a[i] % 2 == 0 && a[i+1] % 2 != 0) {
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
        }

        for(int i=0; i<n; i++){
            System.out.println(a[i]);
        }
        
        
    }
}