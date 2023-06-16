package Switch;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		//Write a code take a day number from user and display respected day name
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the number-");
		
		int day=sc.nextInt();
		
		switch(day) {
		
		case 1: System.out.println("Monday");
		break;
		case 2: System.out.println("Tueday");
		break;
		case 3: System.out.println("Wednesday");
		break;
		case 4: System.out.println("Thursday");
		break;
		case 5: System.out.println("Friday");;
		break;
		case 6: System.out.println("Satuday");
		break;
		case 7: System.out.println("Sunday");
		break;
		default:System.out.println("Invalid Day");
		
		}
		sc.close();



	}

}
