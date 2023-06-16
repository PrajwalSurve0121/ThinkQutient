package Assignment2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		//  Write a java program to find sum of digits in any number. e.g. number is 435 sum is 12
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		int sum=0;
		for (int i=1;i<=num;i++)
		{
			int di=num%10;
			sum=sum+di;
			num=num/10;
			
		}
		System.out.println(sum);
		sc.close();
		

	}

}
