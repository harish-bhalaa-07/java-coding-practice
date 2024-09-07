import java.util.Arrays;

public class bubbleSort {
    public static void bSort(int[] arr){
        boolean sorted = false;
        for(int i=1; i<arr.length; i++){
            for(int j=0; j<arr.length - i; j++){
                if (arr[j] > arr[j+1]){
                    sorted = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if (!sorted){
                break;
            }
        }
    }

    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};

        bSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
