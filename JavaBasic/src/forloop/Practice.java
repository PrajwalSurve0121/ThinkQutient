package forloop;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		sc.close();
		int num=sc.nextInt();
		int i=num;
		for ( ;i<=120;i++) {
			System.out.println(i);
		}
		
		System.out.println("Enter the number=");
        int num1=sc.nextInt();
        int j=num1;
        for ( ;j>=270;j--) {
        	System.out.println(j);
        }
        
        System.out.println("Enter the number=");
        int num2=sc.nextInt();
        int k=num2;
        for ( ;k<=10;k++) {
        	System.out.println(k);
        sc.close();	        	
        }
        
        System.out.println("Enter the number=");
        int num3=sc.nextInt();
        int a=0;
        for (int ik=num3;ik<=10;ik++) {
        	a=a+ik;
        	
        }
        System.out.println(a);
        
        System.out.println("Enter the number=");
        int num4=sc.nextInt();
        int b=0;
        int ij=num4;
        for ( ;ij<=20;ij++) {
        	if(ij%2!=0)
        		b=b+1;
        	
        }
        System.out.println(b);
        sc.close();
        


	}

}
        
          
