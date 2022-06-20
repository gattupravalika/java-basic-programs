package Patterns;

public class Pattern19 {

	public static void main(String[] args) {
		int n=5; 
        int i;
		int j;
		for (i= 0; i<=n-1; i++)  
		{  
		for (j=0; j<=i; j++)   
		{  
		System.out.print("*"+ " ");  
		}   
		System.out.println("");   
		}   
		for (i=n-1; i>=0; i--)  
		{  
		for(j=0; j <=i-1;j++)  
		{  
		System.out.print("*"+ " ");  
		}  
		System.out.println("");  
	}

}
}
