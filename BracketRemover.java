import java.util.Scanner;

public class BracketRemover {

    public static char[] bracketRemove(String s) {
        char[] c = s.toCharArray();
        char[] result = new char[s.length()];
        int resultIndex = 0;  
        
        for (char ch : c) {
            if (ch != '(' && ch != ')' && ch != '[' && ch != ']' && ch != '{' && ch != '}') {
                result[resultIndex++] = ch;  
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(bracketRemove(s));
    }
}
