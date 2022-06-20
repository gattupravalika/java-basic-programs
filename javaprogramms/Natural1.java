package javaprogramms;

import java.util.Scanner;

public class Natural1 {
    	public static void main(String[] args) {
    	
			// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
    System.out.println("enter the range: ");
	int x=sc.nextInt();
    int i, j, k=1;
	for(i = 1; i <= x/6; i++)
	{
		for(j = 1; j<=6 ; j++)
	
	{
		System.out.print(k++ + " ");
		
	}
		System .out.println();
	}
		}

	}


