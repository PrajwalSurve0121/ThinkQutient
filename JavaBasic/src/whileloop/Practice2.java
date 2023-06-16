package whileloop;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		//Write code to display number from 340 to 270
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int i=num;
		while (i>=270)
		{
			System.out.println(i);
			i--;
			
		}


	}

}
