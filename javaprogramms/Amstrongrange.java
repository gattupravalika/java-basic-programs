package javaprogramms;
import java.util.Scanner;
public class Amstrongrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int add, rem;
		for(int i=x; i<=y; i++)  
	
		{
			int num=i;
		add=0;
		while(num>0)
		   {
			   rem=num%10;
			   add=add+rem*rem*rem;
			   num=num/10;
		   }
		   if(i==add)
		   {
			   System.out.println(i);
		   }
			
		}
	}
}
	

	
