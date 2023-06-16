package Ladder_if_else;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		// Write a code to check given number is divisible by 3 or 9 
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr the number");
		
		int num=sc.nextInt();
		
		if (num%3==0 && num%9==0)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
		
		



	}

}
