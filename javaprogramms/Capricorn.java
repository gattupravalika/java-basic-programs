package javaprogramms;
import java.util.Scanner;
public class Capricorn {
  public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number=");
        int n = scanner.nextInt();
         boolean isCapricorn = false;
         
        int square = n * n;
        int temp = square;
        int num= 0;
        
        while (temp > 0)
        {
            num++;
            temp /= 10;
        }
       
        for (int i = 1; i < num; i++)
        {
            int divisor = (int) Math.pow(10, i);
            int quotient = square / divisor;
            int remainder = square % divisor;
            if (quotient + remainder == n)
            {
                isCapricorn = true;
            }
        }
        if (isCapricorn)
        {
            System.out.println("Capricorn number");
        } else
        {
            System.out.println("Not Capricorn number");
        }
    }

	}


