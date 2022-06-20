package javaprogramms;
public class Strong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n=145, add=0,temp=n,rem;
		   while(n>0)
		   {
			   rem=n%10;
			   int fact=1;
			   for(int i=1; i<=rem; i++)
			   {
				   fact=fact*i;
			   }
			   add=add*fact;
			   n=n/10;
		   }
		   System.out.println(add);
		   if(temp==add)
		   {
			   System.out.println(temp+ "is strong");
		   }
		   else
		   {
			   System.out.println(temp+ "is not strong");
		   }
			}

	}

