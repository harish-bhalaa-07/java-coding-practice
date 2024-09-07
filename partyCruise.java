import java.io.*;
import java.util.*;

public class partyCruise {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e[] = new int[n];
        int l[] = new int[n];
        int a[] = new int[n];
        
        for(int i=0; i<n; i++){
            e[i] = sc.nextInt();
        }
        
        for(int i=0; i<n; i++){
            l[i] = sc.nextInt();
        }
        
        int people = 0 ;
        for(int i=0; i<n; i++){
            people += e[i]-l[i];
            a[i] = people;
        }
        Arrays.sort(a);
        System.out.println(a[n-1]);
        
        
    }
}