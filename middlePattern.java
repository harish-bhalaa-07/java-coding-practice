import java.util.*;

public class middlePattern {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String p = "";
        int mid = s.length()/2;
        for(int i=0; i<s.length(); i++){
            mid = (mid)%s.length();
            p += s.charAt(mid);
            System.out.print(p+"$"+" ");
            mid++;
        }
    }
}