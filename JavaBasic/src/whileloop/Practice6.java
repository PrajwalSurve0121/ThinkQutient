package whileloop;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		// find factorial of given number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");  
		int num=sc.nextInt();
		int fact=1;
		int i=1;
		while (i<=num)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("factorial" +  +num   + "is:" +fact);
		sc.close();

	}
	

}
