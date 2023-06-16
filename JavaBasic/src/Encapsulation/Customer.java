package Encapsulation;

import java.util.Scanner;

public class Customer {
	private int id;
	private String name;
	private int balance=50000;
	
//	int a=8000;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
//	public void setBalance(int balance)
//	{
//		this.balance=balance;
//	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public void getBalance()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Amount:");
		int deductamo=sc.nextInt();
		int remainingbalance=balance-deductamo;
		System.out.println(remainingbalance);
	}
//	public void dudctbal()
//	{
//		balance=balance-a;
//		
//	}
	

	public static void main(String[] args) {
		
//		Scanner sc=new Scanner(System.in);
//		int deductedamount=sc.nextInt();
//		int remainingBal=balance-deductedamount;
//		 
		
		
		

	}

}
