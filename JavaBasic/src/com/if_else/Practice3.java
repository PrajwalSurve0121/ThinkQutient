package com.if_else;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		// Write code to check the given number is less than 50 or not
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr The Number");
		
 		int num=sc.nextInt();
		if (num<=50)
			System.out.println("Number is Valid");
		else
			System.out.println("Number is invalid");
		sc.close();
		
		

	}

}
