package javaprogramms;

public class biggest5num {

	public static void main(String[] args) {
		int[] numbers = {1,4,8,45,6,87,2,3};
		int temp =0;
		for(int i=0;i<=numbers.length-1;i++) {
			for(int j=1; j<=numbers.length-1;j++) {
				if(numbers[i]>numbers[j]) {
					if(numbers[i]>temp)
					{
						temp = numbers[i];
						break;
					}
				}
			}
		}
		// TODO Auto-generated method stub
System.out.println(temp);
	}

}
