package areaoftriangle;

import java.util.Scanner;
/**
 * programm for trianlge using constructor 
 * @author pg22061
 *
 */

public class AOT{

	long area;
	AOT(long b,long h)
	{
		area=(b*h)/2;
	}
}
class Xyz
{
	
public static void main(String[] args)
{
		
Scanner sc=new Scanner(System.in);
System.out.println("Enter the width of the Tringle:");
long b=sc.nextLong();
System.out.println("Enter the height of the triangle:");
long h=sc.nextLong();
AOT A1=new AOT(b, h);
System.out.println("Area of tringle id:" +A1.area);
	}
}


