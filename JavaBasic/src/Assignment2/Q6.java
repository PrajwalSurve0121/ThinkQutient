package Assignment2;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// Write a program that displays the day of the week corresponding to the number 
//		entered i.e. 1 - "Monday", 2 - "Tuesday" and so on. For any integer input not between 1 
//		to 7 it should display "error, day does not exist".
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Monday/n2.Tuesday/n3.wednesday/n4.Thursday/n5.Friday/n6.Saturday/n7.Sunday");
		System.out.println("Enter the choice from above day");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:System.out.println("Monday");
		break;
		case 2:System.out.println("Tuesday");
		break;
		case 3:System.out.println("Wednesday");
		break;
		case 4:System.out.println("Thursday");
		break;
		case 5:System.out.println("Friday");
		break;
		case 6:System.out.println("Saturday");
		break;
		case 7:System.out.println("Sunday");
		break;
		default:System.out.println("Error, Day does not exist ");
		}
 

	}

}
