package AccessModifier;

public class BankAccount {
	
	private int AccNum;
	private String Acctype;
	private String CusName;
	private int Accbal;
	
	public void setAccNum(int AccNum)
	{
		this.AccNum= AccNum;
	}
	public void setAcctype(String Acctype)
	{
		this.Acctype= Acctype;
	}
	
	public void setCusName(String CusName)
	{
		this.CusName= CusName;
	}
	public void setAccbal(int Accbal)
	{
		this.Accbal= Accbal;
	}
	
	public int getAccNum()
	{
		return AccNum;
	}
	public String getAcctype()
	{
		return Acctype;
	}
	public String getCusName()
	{
		return CusName;
	}
	public int getAccbal()
	{
		return Accbal;
	}
	

	

	

}
