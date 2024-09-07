import java.util.Arrays;

public class MoreThanNByKTimes {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 2, 1, 2, 3, 3};
        int k = 4;
        findElements(arr, k);
    }

    public static void findElements(int[] arr, int k) {
        int n = arr.length;
        int threshold = n / k;


        Arrays.sort(arr);

        int count = 1; 
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                count++; 
            } else {
                if (count > threshold) {
                    System.out.print(arr[i - 1] + " ");
                }
                count = 1; 
            }
        }

        if (count > threshold) {
            System.out.print(arr[n - 1] + " ");
        }
    }
}
