package All_Practice;

import java.util.Scanner;

public class pract {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0;i<=2*num;i++)
		{
			int space=i>num ? 2*num-i:i;
			for(int j=0;j<=space;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
