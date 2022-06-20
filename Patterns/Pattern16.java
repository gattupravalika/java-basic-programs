package Patterns;

public class Pattern16 {

	public static void main(String[] args) {
		int n=5;
		int x=1;
		for(int i=n; i>=1; i--)
		{
			for(int j=n; j>=i; j--)
			{
				System.out.printf("%2d ",x);
				x+=2;
			}
		System.out.println();	

	}
	}
}
