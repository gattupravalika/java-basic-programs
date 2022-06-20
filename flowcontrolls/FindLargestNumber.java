package flowcontrolls;

import java.util.Scanner;

public class FindLargestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first, Second, Third number ?");
int firstnumber=sc.nextInt();
int secondnumber=sc.nextInt();
int thirdnumber=sc.nextInt();
if(firstnumber > secondnumber && firstnumber > thirdnumber)
{
	System.out.println("first number is largest number");
}
else if(secondnumber > firstnumber && secondnumber > thirdnumber)
{
	System.out.println("Second number is largest number");
	}
else if(thirdnumber > firstnumber && thirdnumber > secondnumber)
{
	System.out.println("Third number is largest number");
	}
else{
	System.out.println("Any two or more numbers are equals");
}
	}
}
