package flowcontrolls;

public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr={10, 20, 30,40,50};
System.out.println("--Normal for loop--");
for(int i=0; i<arr.length; ++i){
System.out.println(arr[i]);
	}
	System.out.println("--for each loop--");
for(int k:arr)
	System.out.println(k);
	}

	}
	



