package corejava;

public class StaticVariable {
static int a=50;
int c=60;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StaticVariable var=new StaticVariable();
int b=30;
System.out.println("A="+a);
System.out.println("B="+b);
var.m1();
	}
public void m1(){
	System.out.println("C="+c);                                                                                
}
}
