package fundamental;

public class StringPalindrome {

	public static void main(String[] args) {
		 
 String str = "radar" , reverseStr="0"; 
int strLength= str.length();
for(int i=(strLength-1);i>=0; --i)
 {
	reverseStr=reverseStr+str.charAt(i);
 }
if(str.toLowerCase().equals(reverseStr.toLowerCase()))
{
	System.out.println(str + " is a palindrome String.");
 }
else{
	System.out.println(str + " is not a palindrome String.");
}
	}

}
