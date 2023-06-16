package forloop;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		//Write a code to calculate the number of odd number between 1 to 20  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the number-");
		
		int num=sc.nextInt();
		int c=0;
		for (int i=num;i<=20;i++) {
			if (i%2!=0)
			c=c+1;   
		}
		System.out.println(c);
		sc.close();

	}

}
