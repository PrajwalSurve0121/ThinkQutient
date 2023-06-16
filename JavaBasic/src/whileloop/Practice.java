package whileloop;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int i=1;
		while (i<=20)
		{
			if (i%4==0 && i%6==0) {
				break;
			}
			System.out.println(i);
			i++;
		}

	}

}
