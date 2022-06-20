package javaprogramms;

import java.util.Scanner;

public class twinprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 2 numbers:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
	int c1=0, c2=0;
	for(int i=1; i<=n1; i++)
	{
		if(n1%i==0)
		{
			c1++;
		}
	}
	for(int i=1; i<=n2; i++)
	{
		if(n2%i==0)
		{
			c2++;
	}
	}
	
	if(c1==2&&c2==2&&Math.abs(n1-n2)==2)
	{
		System.out.println("twin prime number");
	}
	else
	{
		System.out.println("not twin prime number");
	}
	}
	}

	
	
