import java.io.*;
import java.util.*;

public class jumpGame {

    public static boolean canHopToEnd(int[] array, int length){
        int lastPosition = length - 1;
        for(int i = length - 2; i >= 0; i--){
            if(i + array[i] >= lastPosition){
                lastPosition = i;
            }
        }
        return lastPosition == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        
        for(int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }
        scanner.close(); 
        boolean result = canHopToEnd(array, n);
        System.out.println(result);
    }
}