package com.if_else;

import java.util.Scanner;

public class Practice7_vowel_class {

	public static void main(String[] args) {
		// WAP to check the given program is vowel or not
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the chracter:");
		char ch=sc.next().charAt(0);
//		if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
//		{
//			System.out.println("Vowel");
//		}
//		else
//		{
//			System.out.println("Consonent");
//		}
		
		if (ch=='a')
		{
			System.out.println("Vowel");
		}
		else if (ch=='e') {
			System.out.println("Vowel");
		}
		else if (ch=='i') {
			System.out.println("Vowel");
		}
		else if(ch=='o') {
			System.out.println("Vowel");
		}
		else if(ch=='u') {
			System.out.println("Vowel");
		}
		else {
			System.out.println("Consonent");
		}

	}

}
