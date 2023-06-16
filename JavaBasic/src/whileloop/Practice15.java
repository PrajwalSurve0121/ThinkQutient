package whileloop;

import java.util.Scanner;

public class Practice15 {

	public static void main(String[] args) {
		// Write code to find a sum of first digit and last digit from the number
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the number");
		int num= sc.nextInt();
		int firstDigit=0;
		int lastDigit=num%10;
		while (num>0)
		{
			firstDigit=num%10;
			num=num/10;
		}
		int sum= firstDigit + lastDigit;
		System.out.println(sum);
			
		

	}

}
