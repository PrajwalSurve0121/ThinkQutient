package Assignment2;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// Write a Java program to create a Simple Calculator using switch. Program should accept 
//		2 numbers. Console will display following choices -
//		1. Add 2. Subtract 3. Multiply 4. Divide
//		Based on user input, perform given operation.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number:");
		int num1=sc.nextInt();
		System.out.println("Enter the 2nd number:");
		int num2=sc.nextInt();
		System.out.println("1.Addition/n2.Substraction/n3.Multiplication/n4.Division");
		System.out.println("Enter the choice from above menu");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:System.out.println("Addition"+(num1+num2));
		break;
		case 2:System.out.println("Substraction"+(num1-num2));
		break;
		case 3:System.out.println("Multiplication"+(num1*num2));
		break;
		case 4:System.out.println("Addition"+(num1/num2));
		break;
		default:System.out.println("Invalid choice");
		}
 
	}

}
