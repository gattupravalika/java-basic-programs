package javaprogramms;

public class primerange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int min=2;
int max=100;
for(int n=min;n<=max;n++)
{
	if(isprime(n))
	{
		System.out.println(n);
	}
}
	}
public static boolean isprime(int num) {
	for(int i=2; i<=num/i; i++)
	{
		if(num%i==0)
		{
			return false;
		}
	}
	return true;
}

}
