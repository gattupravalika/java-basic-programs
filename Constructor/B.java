package Constructor;

public class B extends A {
	int a=20;

public B()

{
	super(5);
System.out.println(super.a);
System.out.println("default constructor");
}
	public static void main(String[] args)
	{
		B obj= new B();
		System.out.println( obj.a);
		System.out.println("parametrized constructor");
		
	}

}
