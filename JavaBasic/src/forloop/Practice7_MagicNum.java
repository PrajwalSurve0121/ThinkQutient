package forloop;

import java.util.Scanner;

public class Practice7_MagicNum {

	public static void main(String[] args) {
		// WAP to check the magic number
		Scanner sc=new Scanner(System.in);
		int MagicNumber=50;
		for(;;)
		{
			System.out.println("Enter number:");
			int num=sc.nextInt();
			if(num>MagicNumber)
			{
				System.out.println("The given number greater try again");
				continue;
			}
			
			else if(num<MagicNumber)
			{
				System.out.println("The given number less try again");
				continue;
			}
			else 
			{
				System.out.println("The given number Correct ");
				break;
			}
		}

	}

}
