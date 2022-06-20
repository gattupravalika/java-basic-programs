package Factorial;

public class Factorial4 {

	public static void main(String[] args) {
     long n, fact=1;
		
		n=Long.parseLong(args[0]);
		
		for(int i=1; i<=n; i++)
		{
			fact=fact*1;
		}
System.out.println("fact="+fact);

	}

}
