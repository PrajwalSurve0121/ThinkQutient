package AccessModifier;

public class BankAccountInfo  {
	
	

	public static void main(String[] args) {
		
		BankAccount info=new BankAccount();
		info.setAccNum(5125100);
		info.setAcctype("Saving");
		info.setCusName("Rahul Aware");
		info.setAccbal(10000000);
		
		System.out.println(info.getAccNum());
		System.out.println(info.getAcctype());
		System.out.println(info.getCusName());
		System.out.println(info.getAccbal());
		
		
	}

}
