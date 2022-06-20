package flowcontrolls;

import java.util.Scanner;

/**
 * given number is even r odd 
 * @author pg22061
 *
 */
public class IfElseDemo {
	public static void main(String[] args)
	{
	Scanner Sc=new Scanner(System.in);
	System.out.println("Enter a number ?");
	 int number= Sc.nextInt();
	 if(number%2==0)
	 {
		 System.out.println("Given number is Even");
	 }
	 else
	 {
		 System.out.println("Given number is odd");
	 }

	}
}
