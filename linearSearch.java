import java.util.Arrays;

public class linearSearch {

    public static int find(int[] arr, int key){
        for(int i = 0; i<arr.length; i++){
            if (arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static int find(String name, char key){
        for(int i = 0; i<name.length(); i++){
            if (name.charAt(i) == key){
                return i;
            }
        }
        return -1;
    }

    public static int[] find(int[][] arr, int key){
        for(int row=0; row<arr.length; row++){
            for(int col =0; col<arr[row].length; col++){
                if(arr[row][col] == key){
                    return new int[] {row, col};
                }
            }
        }

        return new int[] {-1,-1};
    }

    public static void main(String args[]){
        int[] arr = {2,5,4,3,7,8,0};

        System.err.println(find(arr, 9));

        String name = "Harish";

        System.err.println(find(name, 'h'));

        int[][] twoDArr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int [] result = find(twoDArr, 5);
        System.err.println(Arrays.toString(result));
    }
}
