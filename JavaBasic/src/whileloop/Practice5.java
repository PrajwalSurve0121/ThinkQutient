package whileloop;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		// Write code to display table of number
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int i=1;
		while (i<=10)
		{
			System.out.println(num+"*"+i+"="+num*i);
			i++;
			
		}
		
		sc.close();

	}

}
