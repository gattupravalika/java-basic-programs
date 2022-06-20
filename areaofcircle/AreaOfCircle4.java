package areaofcircle;

import java.util.Scanner;

public class AreaOfCircle4 {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius:");
		double rad=sc.nextDouble();
		double a=area(rad);
		System.out.println("Area of Circle is:" +a);
	}
	static double area(double rad) {
	
		return (22*rad*rad)/7;
		
	}
}
