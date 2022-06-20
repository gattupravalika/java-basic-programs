package javaprogramms;
import java.util.Scanner;
public class Amstrongnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int add=0,temp=0,rem;
   Scanner sc=new Scanner(System.in);
	System.out.println("enter any value:");
	int n=sc.nextInt();
	temp=n;
   while(n>0)
   {
	   rem=n%10;
	   add=add+rem*rem*rem;
	   n=n/10;
   }
 
   if(temp==add)
   {
	   System.out.println(temp+ "is amstrong");
   }
   else
   {
	   System.out.println(temp+ "is not amstrong");
   }
	}

}
