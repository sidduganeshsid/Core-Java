package ExceptionHandling;

import java.util.Scanner;

public class DivideByZero
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the numbers : ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            int res = num1/num2;
            System.out.println("The result of dividing num1/num2 :: "+res);
        }
        catch (ArithmeticException ae)
        {
            System.out.println("Divided by zero");
        }
    }
}