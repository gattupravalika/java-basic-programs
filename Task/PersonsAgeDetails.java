package Task;

import java.util.Scanner;

public class PersonsAgeDetails 
{
	static int birthMonth , birthYear ;
	static double calculateAge(int birthYear,int birthMonth)
	{
		double x=birthYear, y=birthMonth;
		double a,b,c,currentMonth=6,noOfMonths=12;
		
		a=(2022-x)+(currentMonth/noOfMonths);
		b=(y/noOfMonths);
		c=a-b;
		return c;	
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter birthYear");
		birthYear=sc.nextInt();
		
		System.out.println("Enter birthMonth");
		birthMonth=sc.nextInt();
		if(birthMonth<1||birthYear<1)
		System.out.println("1.0");
		else if(birthMonth>12 ||birthYear>2022 ||calculateAge( birthYear, birthMonth)<1)
			System.out.println("2.0");
		else
		System.out.println("Age of the person is "+calculateAge( birthYear, birthMonth));
		}
	}


