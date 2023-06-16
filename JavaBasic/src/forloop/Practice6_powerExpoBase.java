package forloop;

import java.util.Scanner;

public class Practice6_powerExpoBase {

	public static void main(String[] args) {
		// WAP to check the given number's power 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base");
		int base=sc.nextInt();
		System.out.println("Enter expo");
		int expo=sc.nextInt();
		int power=1;
		for (int i=1;i<=expo;i++)
		{
			power=power*base;
			
		}
		System.out.println("Power=" +power);

	}

}
