package fundamental;

public class MethodTypes {
        //instance method
		public void sayHello(String name)
		{
		System.out.println("welcome to ojas "+name);
		}

		public int add(int i,int j)
		{
			
			return i+j;
		}
		//static method
		public static void m1()
		{
		System.out.println("from static method");
		}
		//final method
		public final void m2()
		{
		System.out.println("from final method");
		}
		//abstract method
		//public abstract void m3() [it is in comments bcz if one method is abstract we have to make whole class abstract]

		//synchronized method
		public synchronized void m4()
		{
		System.out.println("from synchronized method");
		}
		public static void main(String args[])
		{
		MethodTypes mt =new MethodTypes();
		mt.sayHello("Pravalika");
		System.out.println(mt.add(10, 20));
		m1();
		mt.m2();
		mt.m4();

		}

	}


