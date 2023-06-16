package whileloop;

import java.util.Scanner;

public class Practice18_ReverseNumber {

	public static void main(String[] args) {
		// WAP to check the Reverse number 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		int reverse=0;
		while (num>0)
		{
			int di=num%10;
			reverse=reverse*10+di;
			num=num/10;
		}
		System.out.println(reverse);

	}

}
