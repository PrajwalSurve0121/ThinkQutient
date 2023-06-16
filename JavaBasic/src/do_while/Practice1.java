package do_while;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// Write code to perform various arithmetic operations
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number:");
		int num1=sc.nextInt();
		System.out.println("Enter the 2nd Number:");
		int num2=sc.nextInt();
		char ch;
		
		do
		{
			System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division");
			System.out.println("Enter your choice from above menu driven");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:System.out.println("Addition "+(num1+num2));
			break;
			case 2:System.out.println("Substraction "+(num1-num2));
			break;
			case 3:System.out.println("Multiplication "+(num1*num2));
			break;
			case 4:System.out.println("Division "+(num1/num2));
			break;
			default:System.out.println("Invalid Choice");
			}
			System.out.println("Do you want to continue . . . .");
			ch=sc.next().charAt(0);
			
		}while(ch=='y' || ch=='Y');
		sc.close();
		

	}

}
