package Ladder_if_else;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		// Write code to check the given character is alphabet or number 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		
		if(ch>=481 && ch<=56) {
			System.out.println("The given input is digit");
		}
		else if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) {
			System.out.println("The given input is alphabet");
		}
		else {
			System.out.println("The given input is special character");
		}

	}

}
