import java.util.Scanner;
public class stringCaps{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String expression=sc.nextLine();
        char first=expression.charAt(0);
        char last=expression.charAt(expression.length()-1);
        char firstcap= (char)(first-32);
        char lastcap= (char)(last-32);
        System.out.print(firstcap);
        for(int i=1;i<expression.length()-1;i++)
        {
            System.out.print(expression.charAt(i));
        }
        System.out.print(lastcap);
        sc.close();
    }
}

public class stringCaps{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String expression=sc.nextLine();
        
    }
}