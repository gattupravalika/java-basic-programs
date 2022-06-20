package corejava;
 
import java.util.Scanner;

public class SumOfTwoNumbers{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("enter your first number");
   int a=sc.nextInt();
   System.out.println("enter your second number");
   int b=sc.nextInt();
   

	int sum=a+b;
    System.out.println("SumOfTwoNumbers "+sum);
}
}

