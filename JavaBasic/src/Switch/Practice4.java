  package Switch;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the number-");
		
		int num=sc.nextInt();
		
		switch(num) {
		
		case 1: System.out.println("Valid Number");
		break;
		case 2: System.out.println("Valid Number");
		break;
		case 3: System.out.println("Valid Number");
		break;
		case 4: System.out.println("Valid Number");
		break;
		case 5: System.out.println("Valid Number");
		break;
		default:System.out.println("Invalid Number");
		
		}
		sc.close();

	}

}
