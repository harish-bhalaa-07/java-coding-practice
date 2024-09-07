import java.io.*;
import java.util.*;

public class nimGame {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%4 == 0)
            System.out.println(false);
        else
            System.out.println(true);
    }
}