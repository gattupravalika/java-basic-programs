package javaprogramms;

import java.util.Scanner;

public class Swapping {
public static void main(String[] args)
{
	int a, b;
	Scanner sc=new Scanner(System.in);
			System.out.println("enter a value;");
	a=sc.nextInt();
System.out.println("enter b value;");
b=sc.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println(a+" "+b);
}
}
