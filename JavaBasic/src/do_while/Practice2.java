package do_while;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// Write a code to calculate area of triangle, rectangle, square, Circle.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int num1=sc.nextInt();
		System.out.println("Enter 2nd Number:");
		int num2=sc.nextInt();
		char ch;
		float pie=3.14f;
		do
		{
			System.out.println("1.Area of triangle\n2.Area of rectangle\n3.Area of Square\n4.Area of circle");
			System.out.println("Enter your choice from above menu");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1: System.out.println("Area of triangle"+((num1*num2)/2));
			break;
			case 2: System.out.println("Area of rectangle"+(num1*num2));
			break;
			case 3: System.out.println("Area of square"+(num1*num1));
			break;
			case 4: System.out.println("Area of circle"+(pie*num1*num1));
			break;
			}
			System.out.println("Do you want to continue . . . .");
			ch=sc.next().charAt(0);
			
		}while(ch=='y' || ch=='Y');
		sc.close();
		

	}

}
