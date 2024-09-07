import java.util.Scanner;

public class naturalRecursion {
    public static void naturalNo(int i, int n){
        if( i > n){
            return;
        }
        System.out.print(i+" ");
        naturalNo(i+1, n);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        naturalNo(1, n);
        sc.close();
    }
}