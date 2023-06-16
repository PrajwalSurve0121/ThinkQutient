package com.if_else;

import java.util.Scanner;

public class Practice8_blooddonationvalidity_class {

	public static void main(String[] args) {
		// WAP to check the candidate are valid for blood donation
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		System.out.println("Enter weight:");
		int weight=sc.nextInt();
		if(age>18)
		{
			if(weight>50) {
				System.out.println("Allow for blood donation");
			}
			else 
			{
				System.out.println("Age is right but weight is less");
			}
		}
		else
		{
			System.out.println("Try next time. . . . .");
		}
		

	}

}
