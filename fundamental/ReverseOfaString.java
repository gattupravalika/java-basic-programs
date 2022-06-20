package fundamental;
// Reverse of a string by using method
import java.util.Scanner;

public class ReverseOfaString {

	public static void main(String[] args) {
		ReverseOfaString rev=new ReverseOfaString();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string : ");
String str=sc.nextLine();
System.out.println("Reverse of string is: "+rev.reverse(str));
	}

	static String reverse(String s) {
		String rev=" ";
		for(int j=s.length();j>0;--j)
		{
			rev=rev+(s.charAt(j-1));
		}
		return rev;
	}

}
