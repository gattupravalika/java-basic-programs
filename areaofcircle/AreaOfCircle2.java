package areaofcircle;

import java.util.Scanner;

class AreaOfCalculation
{
	double area;
	void circle(double r)
	{
		area=(22*r*r)/7;
	}
}

public class AreaOfCircle2 extends AreaOfCalculation  {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius:");
		double rad=sc.nextDouble();
		AreaOfCalculation a=new AreaOfCalculation();
		a.circle(rad);
		System.out.println("Area of Circle is " +a.area);
	}


	}


