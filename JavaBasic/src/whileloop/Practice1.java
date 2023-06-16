package whileloop;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		//write code to display the number between 50 to 120
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int i=num;
		while (i<=120)
		{
			System.out.println(i);
			i++;
		}
		sc.close();

	}

}
