public class SubsetCheck {

    public static boolean isSubset(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3, 4, 5};

        if (isSubset(arr1, arr2)) {
            System.out.println("Array 1 is a subset of Array 2");
        } else {
            System.out.println("Array 1 is not a subset of Array 2");
        }
    }
}
