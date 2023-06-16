package whileloop;

import java.util.Scanner;

public class Practice11 {

	public static void main(String[] args) {
		// Write code to check given number is palindrome
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		int copy=num;
		int sum=0;
		while (0<num)
		{
			int digit=num%10;
			sum=(sum*10)+digit;
			num=num/10;
			
		}
		num=copy;
		if (num==sum) {
			System.out.println("The given number is palindrome ");
			
		}
		else {
			System.out.println("The given number is not palindrome ");
		}
		
		

	}

}
