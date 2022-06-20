package javaprogramms;


import java.util.Scanner;
public class Multiplenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
		int num;
		   Scanner r=new Scanner(System.in);
				System.out.print("Enter any number");
				num=r.nextInt();
			
		for(int i=1; i<=10; i++)
		{
			System.out.println(num+"*"+i+"="+num*i);
		}
		}
	}
}