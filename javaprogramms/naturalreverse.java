package javaprogramms;
import java.util.Scanner;
public class naturalreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a natural number");
		Scanner kb=new Scanner(System.in);
				int N=kb.nextInt();
		while(N>0)
		{
			System.out.print(N+" ");
			N--;
		}

	}

}
