package fundamental;
/**
 * string demo 
 
 * @author pg22061
 *
 */
public class StringDemo {

	public static void main(String[] args) {
		String str="Hyderabad";
		System.out.println("String Length="+str.length());
		System.out.println("0 index character= "+str.charAt(0));
		System.out.println("d character index value="+str.indexOf('d'));
		System.out.println("bad is there in str="+str.contains("bad"));
		System.out.println("Sub String value= "+str.substring(6,9));
		System.out.println("UpperCase="+str.toUpperCase());
		System.out.println("LowerCase="+str.toLowerCase());
System.out.println("Hello "+str);
String str1="  Hi   ";
String str2="  How Are You   ";
		System.out.println(str1+str2);
		
		System.out.println(str1+str2.trim());
	String str3 = "Zeus";
	String str4 = "Chinese";
	System.out.println(str3.compareTo(str4));
	//C comes 23 positions before Z, so it will give you 23
	String str5 = "Thewebsite2is3softwaretesting4help";
	String[] split = str5.split("1234");
	for(String obj: split) 
	{
		System.out.println(obj);
	}
	}

}
