package Patterns;

public class Pattern20 {

	public static void main(String[] args) {
		int n=5;
		 
		for(int i=n-1; i>=0; i--)
		{
			for(int j=n-1; j>1; j--)
			{
				System.out.print(" ");
			}
				
				for(int k=0; k<=i; k++)
				{
				System.out.print((char)(k+65));
			}
		System.out.println();

	}

	}
}
