package com.if_else;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		// Write a code to takw input from user for percentage and passing year. if percentage is more than 60 and passing year is 2021 then allow candidate for interview 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the percentage");
		float percentage=sc.nextFloat();
		System.out.println("Enter the year");
		int yearpassing= sc.nextInt();
		if(percentage>=60) {
			if (yearpassing>=2021) {
				System.out.println("Candiadate allow for interview");
			}
			else {
				System.out.println("reject");
			}
			
		}else {
				System.out.println("reject");
			}
			
		
			
		
				

	}

}
