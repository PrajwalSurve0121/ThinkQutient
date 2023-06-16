package whileloop;

import java.util.Scanner;

public class Practice12 {

	public static void main(String[] args) {
		// Write a code to check the given number is SPY or not
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int copy=0;
		int sum=1;
		while (num>0)
		{
			int digit=num%10;
			copy=copy+digit;
			sum=sum*digit;
			num=num/10;
			
		}
		if (copy==sum) {
			System.out.println("The given number is Spy");
		}
		else {
			System.out.println("The given number is not Spy");
		}

	}

}
