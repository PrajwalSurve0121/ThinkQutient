package Nested_if_else;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// write a program to check given character is upper case letter or lower case letter or any other character
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the character");
		
		char ch=sc.next().charAt(0);
		if (Character.isUpperCase(ch)) {
			System.out.println("Then Character is in Upper case letter");
		}	
		else if (Character.isLowerCase(ch)) {
			System.out.println("Then character is Lower case letter");
		}
		else {
			System.out.println("Character is invalid");
		}


	}

}
