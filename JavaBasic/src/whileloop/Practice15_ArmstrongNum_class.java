package whileloop;

import java.util.Scanner;

public class Practice15_ArmstrongNum_class {

	public static void main(String[] args) {
		// WAP to check the given number is Armstrong or not(for check=153)
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int copy=num;
		int sum=0;
		while (0<num)
		{
			int di=num%10;
			sum=sum+(di*di*di);
			num=num/10;
		}
		System.out.println(sum);
		num=copy;
		if (copy==sum)
		{
			System.out.println("The given number is Armstrong");
		}
		else {
			System.out.println("The given number is not Armstrong");
		}
		
				

	}

}
