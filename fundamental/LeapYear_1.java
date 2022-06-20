package fundamental;

import java.util.Scanner;

public class LeapYear_1 {
	public static void main(String[] args) {
		long a,y,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any year");
		y=sc.nextLong();
		if(y!=0)
		{
		a=(y%400==0)?(c=1):((y%100==0)?(c=0):((y%4==0)?(c=1):(c=0)));
		if(a==1)
		System.out.println(y +" is a leap year");
		else
		System.out.println(y +"is not yeap yr");
		}
		else
		System.out.println("yr zero dsnt exist");
		}



		}

