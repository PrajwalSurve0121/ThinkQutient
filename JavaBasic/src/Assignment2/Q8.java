package Assignment2;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// WAP to check no is Krishnamurthy or not (Using while loop) i.e. 153 = 1! + 5! + 3! = 153(145 is Krishnamurthy)
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int copy=num;
		int sum=0;
		while (num>0)
		{
			int digit=num%10;
			int fact=1;
			for (int i=1;i<=digit;i++) 
			{
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
							
		}
		System.out.println(sum);
		num=copy;
		if(copy==sum)
		{
			System.out.println("The given number is Krishnamurthy ");
		}
		else
		{
			System.out.println("The given number is not Krishnamurthy ");
		}

	}

}
