package whileloop;

import java.util.Scanner;

public class Practice16_PowerBaseExpo {

	public static void main(String[] args) {
		// WAP to check the given number's power
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base");
		int base=sc.nextInt();
		System.out.println("Enter expo");
		int expo=sc.nextInt();
		int power=1;
		int i=1;
		while(expo>=i)
		{
			power=power*base;
			i++;
		}
		System.out.println("Power"  +power);

	}

}
