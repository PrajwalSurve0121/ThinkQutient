package Ladder_if_else;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		//Write a code to check number is positive, negative or zero  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the Number");
		
		int number=sc.nextInt();
		
		if (number>0) {
			System.out.println("The Number is positive");
		}
		else if (number<0) {
			System.out.println("The Number is Negative");
		}
		else {
			System.out.println("Number is Zero");
		}



	}

}
