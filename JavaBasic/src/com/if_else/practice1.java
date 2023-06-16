package com.if_else;

import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		//Write a code to check the number is odd or even    
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = sc.nextInt();
		
		if(num%2==0)
			System.out.println("Number is Even");
		else
			System.out.println("Number is odd");


	}

}
