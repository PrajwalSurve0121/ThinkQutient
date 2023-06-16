package whileloop;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
		// Write code to display number between 1 to 20. If any number is divisible by 4 and 6 then stop loop
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int i=num;
		for ( ;i<=20;i++)
		{
			if (i%4==0 && i%6==0) {
				break;
			}
			System.out.println(i);
		//}
		
		//System.out.println("Enter the number");
		//int num=sc.nextInt();
		//int i=1;
		//while (i<=20)
		//{
			//if (i%4==0 && i%6==0) {
		//		break;
			}
		//	System.out.println(i);
		//	i++;
		//}

		

	}

}

