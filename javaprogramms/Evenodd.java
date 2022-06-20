package javaprogramms;
import java.util.Scanner;
public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out .println("enter any number");
int a=scan.nextInt();
int R=a%2;
boolean result=R==0;
System.out.println(result);
	}

}
