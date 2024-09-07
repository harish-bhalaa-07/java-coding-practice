public class halfSorting {

    public static void halfSort(int[] arr) {
        int n = arr.length;
        int mid = n / 2;

        for (int i = 0; i < mid - 1; i++) {
            for (int j = i + 1; j < mid; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for (int i = mid; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 1, 6, 4};
        halfSort(arr);

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
