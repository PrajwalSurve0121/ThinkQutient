package com.if_else;

import java.util.Scanner;

public class Practice9_maxnumby3_class {

	public static void main(String[] args) {
		// WAP to check the maximum number between the three number
		Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the num1:");
//        int num1=sc.nextInt();
//        System.out.println("Enter the num2:");
//        int num2=sc.nextInt();
//        System.out.println("Enter the num3:");
//        int num3=sc.nextInt();
//        if (num1>num2 && num1>num3)
//        {
//            System.out.println("Num1 is greater");
//        } else if(num2>num1 && num2>num3)
//        {
//            System.out.println("Num2 is greater");
//        }
//        else 
//        {
//            System.out.println("Num3 is greater");
//        }
          


//		if (num1 > num2) {
//			if (num1 > num3) {
//				System.out.println("Num1 is grater");
//			} else {
//				System.out.println("Num3 is gr");
//			}
//		} else if (num2 > num3) {
//			System.out.println(":num2 is greater");
//		} else {
//			System.out.println("Num3 is gr");
//		}


		
		System.out.println("Enter the num1:");
        int num1=sc.nextInt();
        System.out.println("Enter the num2:");
        int num2=sc.nextInt();
        System.out.println("Enter the num3:");
        int num3=sc.nextInt();
        if (num1>num2)
        {
        	if (num1>num3)
        	{
        		System.out.println("Num1 is greater");
        	}
        	System.out.println("Num3 is greater");
        }
        else if (num2>num1)
        {
        	if (num2>num3)
        	{
        		System.out.println("Num2 is greater"); 
        	}
        	else 
        		{
        		System.out.println("Num3 is greater");
        		}
        }
	}
	

}
