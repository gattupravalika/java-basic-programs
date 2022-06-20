package javaprogramms;

public class Factorsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number=10;
int sum=1;
for(int i=1; i<number; i++)
{
	if(number%i==0)

	{
		sum=sum*i;
		System.out.println(sum);

	}
}
	}

}
