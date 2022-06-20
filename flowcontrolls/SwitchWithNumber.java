package flowcontrolls;

import java.util.Scanner;

public class SwitchWithNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("--------");
System.out.println("|  SwitchApplication 1");
System.out.println("---------");
System.out.println("| 1.Add   |");
System.out.println("| 2.Sub   |");
System.out.println("| 3.Mul   |");
System.out.println("| 4.Div   |");
{
	System.out.println("Enter your choice ?");
	int choice= sc.nextInt();
	System.out.println("Enter A value ?");
	int a= sc.nextInt();
	System.out.println("Enter B value ?");
	int b= sc.nextInt();
	switch(choice)
	{
	case 1:
		System.out.println("Result="+(a+b));
		break;
	case 2:
		System.out.println("Result="+(a-b));
		break;
	case 3:
		System.out.println("Result="+(a*b));
		break;
	case 4:
		System.out.println("Result="+(a/b));
		break;
		default:
		System.out.println("please select your ranges 1-4 only");
	}
	
}
	}

}
