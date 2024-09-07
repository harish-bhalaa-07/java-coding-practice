public class binarySearch {
    public static int bsFind(int[] arr, int key){
        int start = 0, end = arr.length -1;

        boolean flag = false;

        if (start > end)
            flag = true;

        if (flag){
            while(start<=end){
                int mid = (start + end)/2;
    
                if(arr[mid] < key)
                    start = mid+1;
    
                else if (arr[mid] > key)
                    end = mid-1;
                
                else
                    return mid;
            }
        }
        else{
            while(start<=end){
                int mid = (start + end)/2;
    
                if(arr[mid] < key)
                    end = mid-1;
    
                else if (arr[mid] > key)
                    start = mid+1;
                
                else
                    return mid;
            }
        }

        return -1;
    }

    public static void main(String args[]){
        int[] arr = {59,43,34,15,4};

        System.out.println(bsFind(arr, 43));
    }
}
