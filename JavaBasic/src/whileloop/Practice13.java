package whileloop;

import java.util.Scanner;

public class Practice13 {

	public static void main(String[] args) {
		// Write code to calculate the sum of the even digit from the number
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the number");
		int num= sc.nextInt();
		int sum=0;
		while(num>0) {
			int digit=num%10;
			if(digit%2==0) {
				sum=sum+digit;
			}
			num=num/10;
		}
		System.out.println(sum);

	}

}
