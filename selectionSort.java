import java.util.Arrays;

public class selectionSort {
    public static void sSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }

                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String args[]){
        int[] arr = {4,3,21,7,2};

        sSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
