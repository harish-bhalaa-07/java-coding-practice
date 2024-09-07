
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int min = Integer.MAX_VALUE;
        for(int i =1; i<n; i++){
            if ((a[i] - a[i-1]) < min){
                min = a[i] - a[i-1];
            }
        }
        
        for(int i=1; i<n; i++){
            if(min == a[i] - a[i-1]){
                System.out.print(a[i-1]+" "+a[i]+" ");
            }
        }
    }
}