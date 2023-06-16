package Switch;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		//Write a code to check the given character is odd or even
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the number");
		
		int num=sc.nextInt();
		
		switch(num%2) {
		case 1: System.out.println("The given number is odd");
		break;
		case 0: System.out.println("The given number is even");
		break;
		default: System.out.println("The given number is invalid");
		}
		sc.close();

	}

}
