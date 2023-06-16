package forloop;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		//write a code to perform sum of the number between 1 to 10
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the number-");
		
		int num=sc.nextInt();
		int b=0;
		for (int i=num;i<=10;i++) {
			b=b+i;
			
		}
		System.out.println(b);
		sc.close();

	}

}
