import java.io.*;
import java.util.*;

public class subSequence {
    
    public static boolean isSubsequence(String s, String t){
        int l=0, r=0;
        while(l<s.length() && r<t.length()){
            if(s.charAt(l) == t.charAt(r)){
                l++;
            }
            r++;
        }
        if(l==s.length()){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        
        System.out.println(isSubsequence(s,t));
    }
}