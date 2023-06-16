  package whileloop;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		// Write code to perform sum of the number between 1 to 10
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int i=num;
		int sum=0;
		while (i<=10)
		{
			sum=sum+i;
			i++;
		}
		System.out.println(sum);
		sc.close();

	}

}
