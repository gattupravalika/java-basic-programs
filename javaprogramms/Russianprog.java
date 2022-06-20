package javaprogramms;
import java.util.Scanner;
public class Russianprog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter any 2 numbers:");
int x=sc.nextInt();
int y=sc.nextInt();
int res=0;
while(y!=0)
{
	if(y%2!=0)
		res=res+x;
		x=x<<1;
	y=y>>1;
}
System.out.println("product of 2 numbers"+res);
}
	}


