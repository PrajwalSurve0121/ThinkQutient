package do_while;

import java.util.Scanner;

public class Practice4_1to5table {

	public static void main(String[] args) {
		// WAP to print a table between 1 to 5
		Scanner sc=new Scanner(System.in);
		
		int i=1;
		do
		{
			
			System.out.println("Enter the number:");
			int num=sc.nextInt();
			switch(i)
			{
			case 1:System.out.println(num+"*"+i+"="+num*i);
			break;
			case 2:System.out.println(num+"*"+i+"="+num*i);
			break;
            case 3:System.out.println(num+"*"+i+"="+num*i);
            break;
			case 4:System.out.println(num+"*"+i+"="+num*i);
			break;
			case 5:System.out.println(num+"*"+i+"="+num*i);
			break;
			default: System.out.println("Invaid Number");
			
			}i++;
						
		}while(i<=10);
		
		

	}

}
