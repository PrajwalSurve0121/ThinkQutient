package whileloop;

import java.util.Scanner;

public class Practice17_SumNumber {

	public static void main(String[] args) {
		// WAP to check the given number sum
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int sum=0;
		while (num>=1)
		{
			int di=num%10;
			sum=sum+di;
			num=num/10;
		}
		System.out.println(sum);

	}

}
