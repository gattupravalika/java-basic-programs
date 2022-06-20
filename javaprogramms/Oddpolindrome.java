package javaprogramms;

import java.util.Scanner;

public class Oddpolindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter min positive");
int n=sc.nextInt();
System.out.println("enter max positive");
int m=sc.nextInt();
int count=0;
for(int i=n;i<=m;i++)
{
	int rem, reverse=0, tem=i, tem1=i;
	while(tem>0) {
		rem=tem%10;
		reverse=reverse*10+rem;
		tem=tem/10;
	}
	if(tem1==reverse)
	{
		if(tem1%2!=0)
		{
	
		System.out.println(tem1+"is odd polyndrome");
		count++;

}
	}

}
System.out.println(n+" in between range of polyndrome "+m+" "+count);
	}
}

