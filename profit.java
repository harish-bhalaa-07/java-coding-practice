import java.util.*;

public class profit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i =0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int buy = 0;
        int sell = 1, profit, max = 0;
        while(sell<n){
            if(a[sell] > a[buy]){
                profit = a[sell] - a[buy];
                if (profit > max){
                    max = profit;
                }
                else{
                    sell = profit;
                }
                sell++;
            }
        }
        System.out.println(sell);
    }
}