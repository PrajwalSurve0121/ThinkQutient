package forloop;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// write a code to display the number from 340 to 270
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the number-");
		
		int num=sc.nextInt();
		for (int i=num;i>=270;i--) {
			System.out.println(i);
		}
		sc.close();

	}

}
