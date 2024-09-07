import java.util.Arrays;

public class Permutations {
    public static void main(String[] args) {
        String str = "ABC";
        printPermutationsLexicographic(str);
    }

    public static void printPermutationsLexicographic(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        
        System.out.println(new String(chars));

        while (nextPermutation(chars)) {
            System.out.println(new String(chars));
        }
    }

    public static boolean nextPermutation(char[] chars) {
        int n = chars.length;
        
        int i = n - 2;
        while (i >= 0 && chars[i] >= chars[i + 1]) {
            i--;
        }
        
        if (i < 0) {
            return false;
        }
        
        int j = n - 1;
        while (chars[j] <= chars[i]) {
            j--;
        }
        
        swap(chars, i, j);
        
        reverse(chars, i + 1, n - 1);
        
        return true;
    }

    public static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void reverse(char[] chars, int start, int end) {
        while (start < end) {
            swap(chars, start, end);
            start++;
            end--;
        }
    }
}
