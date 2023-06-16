package Encapsulation;

class Address 
{
	private int pincode;
	private String city;
	private int housenum;


public void setPincode(int pincode)
 {
	this.pincode=pincode; 
 }
public void setCity(String city)
{
	this.city=city;
}

public void setHousenum(int housenum)
{
	this.housenum=housenum; 
}
public int getPincode()
{
	return pincode;
}
public String getCity()
{
	return city;
}
public int getHousenum()
{
	return housenum;
}
}

public class GSPerson {
	
	private int id;
	private String name;
	private Address adr;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAdr(Address adr)
	{
		this.adr=adr;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public Address getAddress()
	{
		return adr;
	}

	public static void main(String[] args) {
		
		GSPerson p=new GSPerson();
		p.setId(101);
		p.setName("Ram");
		p.setAdr(new Address());
		Address a=p.getAddress();
		a.setPincode(412105);
		a.setCity("Pune");
		a.setHousenum(12);
		a.getPincode();
		a.getCity();
		a.getHousenum();
		
		System.out.println(a.getPincode());
		System.out.println(a.getCity());
		System.out.println(a.getHousenum());
		
		
	}

}
