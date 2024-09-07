import java.util.*;

public class lotteryGame {

    public static boolean check(int n, int a, int b){
        while(n!=0){
            int rem = n%10;
            if(rem!=a && rem!=b) return false;
            
            n = n/10;
        }
        return true;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int range = sc.nextInt();
        
        for(int i=1; i<range; i++){
            if(check(i, start, end)){
                System.out.print(i+" ");
            }
        }
        
    }
}   
