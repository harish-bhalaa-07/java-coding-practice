import java.util.Scanner;
public class decimalHexa{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int decimal=sc.nextInt();
        int remainder=0;
        int quotient=1;
        while(quotient==0)
        {
            quotient=decimal/16;
            remainder=decimal%16;
            switch(remainder)
            {
                case 10:
                    System.out.print("A");
                    break;
                case 11:
                    System.out.print("B");
                    break;
                case 12:
                    System.out.print("C");
                    break;
                case 13:
                    System.out.print("D");
                    break;
                case 14:
                    System.out.print("E");
                    break;
                case 15:
                    System.out.print("F");
                    break;
                default:
                    break;
            }
            decimal=quotient;
        }
    }
}