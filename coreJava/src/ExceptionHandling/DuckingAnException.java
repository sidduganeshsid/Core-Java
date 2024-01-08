package ExceptionHandling;

import java.util.Scanner;

class Alpha
{
	public void alpha() throws ArithmeticException
	{
		
		Scanner sc = new Scanner(System.in);
		
//		try {
		System.out.println("Enter the num1 and num2 :: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int res = num1/num2;
		
		System.out.println(res);
//		}catch(ArithmeticException ae) {
//			System.out.println("divided by zero");
//		}
		
		System.out.println("exit from the alpha strack frame");
	}
}

public class DuckingAnException {

	public static void main(String[] args) {
		
		try {
		System.out.println("main method execution started");
		Alpha a = new Alpha();
		a.alpha();
		}
		catch(ArithmeticException ae)
		{
			System.out.println("divided by zero[handled by main method]");
		}
		System.out.println("main method exit");
		
	}

}
