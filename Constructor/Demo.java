package Constructor;

public class Demo {
Demo()
{
	System.out.println("Default consrtuctor");
}
Demo(int i)
{
	System.out.println("Parameterized constructor");
}
public static void main(String[] args)
{
	System.out.println("From Demo");
	Demo d=new Demo(10);
}
}
