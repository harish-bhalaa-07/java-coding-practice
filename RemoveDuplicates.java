import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {

    public static int[] removeDuplicates(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        int[] result = new int[arr.length];
        int index = 0;

        for (int value : arr) {
            if (seen.add(value)) {
                result[index++] = value;
            }
        }

        return Arrays.copyOf(result, index);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 4, 5, 3};

        System.out.println("Original array: " + Arrays.toString(arr));

        int[] newArr = removeDuplicates(arr);

        System.out.println("Array after removing duplicates: " + Arrays.toString(newArr));
    }
}
