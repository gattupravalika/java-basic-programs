package Constructor;

public class A {
	 protected int a=30;
	public A() {
		System.out.println("defalt parameterized");
	}
	A(int x)
	{
		this();
		System.out.println("defalt parameterized"+x);
  System.out.println("parent parameterized");
	}
	
	public static void main(String[] args)
	{
		System.out.println("two parameterized");
         A obj=new A(10);
	}
}
