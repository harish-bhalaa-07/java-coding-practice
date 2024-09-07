public class FibonacciDp{
    public static void main(String args[]){
        int n =10;
        int memo[] = new int[n+1];
        System.out.print("0" + " ");
        for(int i=0; i<n; i++){
            System.out.print(fib(i, memo)+ " ");
        }
    }
    
    public static int fib(int n, int[] memo){
        if(memo[n] != 0){
            return memo[n];
        }
        if(n == 0 || n==1){
            return 1;
        }
        else{
            memo[n] = fib(n-1, memo) + fib(n-2, memo);
            return memo[n];
        }
    }
}