package whileloop;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		// write code to find the average of digits;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digit:");
		int num=sc.nextInt();
		int count=0;
		int sum=0;
		while (sum<num)
		{
			int digit=num%10;
			count++;
			sum=sum+digit;
			num=num/10;
			
			
		}
		double avg = (double)sum / count;
		System.out.println(avg);
		
		

	}

}
