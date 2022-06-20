package areaofcircle;

import java.util.Scanner;

class Area
{
	double area;
	Area(double r)
	{
		area=(22*r*r)/7;
		
	}
}
public class AreaOfCircle3 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the radius");
	double rad=sc.nextDouble();
	Area a=new Area(rad);
	System.out.println("Area Of Circle is: " +a.area);
}
}
