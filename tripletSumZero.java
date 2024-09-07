import java.util.Arrays;

public class tripletSumZero {
    public static boolean findTriplet(int[] arr, int n) {
        Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    return true;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, -1, 2, -3, 1};
        int n1 = arr1.length;
        System.out.println(findTriplet(arr1, n1) ? 1 : 0); // Output: 1

        int[] arr2 = {1, 2, 3};
        int n2 = arr2.length;
        System.out.println(findTriplet(arr2, n2) ? 1 : 0); // Output: 0
    }
}
