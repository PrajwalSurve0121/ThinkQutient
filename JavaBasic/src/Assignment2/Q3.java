package Assignment2;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// Write a Java program to input any alphabet and check whether it is vowel or consonant.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character:");
		char ch=sc.next().charAt(0);
		if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				System.out.println("Vowel");
			}
			
		else  {
				System.out.println("Consonent");
			}
						
		
		

	}

}
