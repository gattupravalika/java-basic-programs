package javaprogramms;
import java.util.Scanner;
public class polindrome {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
String abcdcba;
String x= "abcdca";
int i=0, j=x.length()-1;
while(i<j)
{
	if(x.charAt(i) !=x.charAt(j))
	{
	System.out.print("Not polindrome");
	System.exit(0);
  }
i++;
j--;
   }
System.out.print("polindrome");
	}
}
