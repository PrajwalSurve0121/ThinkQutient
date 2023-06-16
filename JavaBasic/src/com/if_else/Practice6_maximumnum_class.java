package com.if_else;

import java.util.Scanner;

public class Practice6_maximumnum_class {

	public static void main(String[] args) {
		// WAP to check the maximum number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int num1=sc.nextInt();
		System.out.println("Enter 2nd number:");
		int num2=sc.nextInt();
		if (num1>num2)
		{
			System.out.println("Num1 is max:" +num1);
		}
		else {
			System.out.println("Num2 is max:" +num2);
		}

	}

}
