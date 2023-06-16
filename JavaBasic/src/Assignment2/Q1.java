package Assignment2;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// Write a java program to find maximum number from given 3 numbers
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int num1=sc.nextInt();
		System.out.println("Enter 2nd number:");
		int num2=sc.nextInt();
		System.out.println("Enter 3rd number:");
		int num3=sc.nextInt();
		if (num1>num2 && num1>num3)
		{
			System.out.println("num1 is greater");
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println("num2 is greater");
		}
		else {
			System.out.println("num3 is greater");
		}
		sc.close();
		

	}

}
