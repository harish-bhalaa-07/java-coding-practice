import java.util.*;
public class parking {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                a[i][j] = sc.nextInt();
            }
        }
        int max=0;
        int res[] = new int[r];
        for(int i=0; i<r; i++){
            int count=0;
            for(int j=0; j<c; j++){
                if(a[i][j] == 1){
                    count +=1;
                }
            }
            res[i] = count;
            if(res[i] > max){
                max = res[i];
            }
        }
        
        for(int i=0; i<r; i++){
            if(res[i] == max){
                System.out.println(i+1);
            }
        }
    }
}