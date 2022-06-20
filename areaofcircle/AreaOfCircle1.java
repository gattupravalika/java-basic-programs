package areaofcircle;

import java.util.Scanner;

public class AreaOfCircle1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius:");
		double r=sc.nextDouble();
		double area=(22*r*r)/7;
		System.out.println("Area of Circle is: "+area);
		
	}

}
