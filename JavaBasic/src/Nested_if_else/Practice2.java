package Nested_if_else;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// Write a code to check given number is divisible by 5 and 11
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number= ");
		
		int num=sc.nextInt();
		if (num%5==0 && num%11==0)
			System.out.println("Number is divisible");
		else 
			System.out.println("Number is not divisible");
		
		

	}

}
