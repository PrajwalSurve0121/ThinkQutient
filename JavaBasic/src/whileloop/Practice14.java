package whileloop;

import java.util.Scanner;

public class Practice14 {

	public static void main(String[] args) {
		// write code to find a average of odd digit from the number
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the number");
		int num= sc.nextInt();
		int sum=0;
		int digit=0;
		int count=0;
		while (num>0)
		{
			digit=num%10;
			count++;
			if (digit%2!=0) {
			sum=sum+digit;
			}
			num=num/10;
		}
		float avg= (float)sum/count ;
		System.out.println(avg);

	}

}
