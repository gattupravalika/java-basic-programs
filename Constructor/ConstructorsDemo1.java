package Constructor;

class Parent {
	Parent() {
		this(10);
		System.out.println("From Parent class");
	}

	Parent(int x) {
		System.out.println("from parent parameter constructor");
	}
}

public class ConstructorsDemo1 extends Parent {
	ConstructorsDemo1() {
		this(10);
		System.out.println("From child class");
	}

	ConstructorsDemo1(int x) {
		//this(10, 20);
		System.out.println("from child parameter constructor");
	}

	ConstructorsDemo1(int x, int y) {
		//this(10, 20, 30);
		System.out.println("from chid 2 parameter constructor");
	}

	ConstructorsDemo1(int x, int y, int z) {
		super();
		System.out.println("from child 3 parameter constructor");
	}

	public static void main(String[] args) {
		
		ConstructorsDemo1 obj = new ConstructorsDemo1();
		
	}
}
