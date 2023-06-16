package whileloop;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		// Write code to calculate odd number between 1 to 20
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int i=1;
		int b=0;
		while (i<=20)
		{
			if (i%2!=0) 
				b=b+1;
				i++;
			
		}
		System.out.println(b);
	}

}
