package javaprogramms;
import java.util.Scanner;
public class perfectnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num, i, sum=1;
Scanner sc=new Scanner(System.in);
System.out.print("enter any number:");
num=sc.nextInt();
for( i=1; i<=num; i++)
{
	if(num%i==0)
	{
		sum=sum*i;
		}
}
if(sum==num)
	
		{
		System.out.print("It is a perfect number");
		}
	else
	{
		System.out.println("It is not a perfect number");
	}
}
}
	

	

