package whileloop;

import java.util.Scanner;

public class Practice9 {

	public static void main(String[] args) {
		// Find the digit sum from the number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digit");
		int num=sc.nextInt();
		int sum=0;
		while (num>0)
		{
			int digit=num%10;
			sum=sum+digit;
			num=num/10;
		}System.out.println("The sum of digit is: " +sum);
		

	}

}

