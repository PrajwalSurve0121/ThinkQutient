
package forloop;

import java.util.Scanner;

public class Practice6_Prime {

	public static void main(String[] args) {
		// WAP to check the given number is Prime or not
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				 count++;
				 break;
			}
						
		}
		if(count>=1)
		{
			System.out.println("Not prime");
		}
		else
		{
			System.out.println("prime");
		}
				
	}

}
