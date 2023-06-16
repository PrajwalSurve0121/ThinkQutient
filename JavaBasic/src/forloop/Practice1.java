package forloop;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		//Write code to display the number between 50 to 120 using for loop
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the number-");
		
		int num=sc.nextInt();
		
		for (int i=num;i<=120;i++) {
			System.out.println(i);
		}
		sc.close();

	}

}
