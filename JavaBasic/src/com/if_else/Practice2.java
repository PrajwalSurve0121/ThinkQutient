package com.if_else;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		//to check the given number is divisible by 5 or not
		Scanner manner= new Scanner(System.in);
		System.out.println("Enetr the Number" );
		
		int num= manner.nextInt();
		if (num%5==0)
			System.out.println("Valid Number");
		else
			System.out.println("Invalid Number");
		
		

	}

}
