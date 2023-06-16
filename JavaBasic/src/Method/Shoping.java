package Method;

public class Shoping {
	
	int productid;
	String productname;
	int quantity;
	int price;
	int total;
	
	public void acceptdetails(int id,String pname,int quan,int pri)
	{
		productid=id;
		productname=pname;
		quantity=quan;
		price=pri;
	}
	
	public void calculatebill()
	{
		total=quantity*price;
	}
	
	public void display()
	{
		if (quantity>0)
		{
			System.out.println(productid+" "+productname+" "+quantity+" "+price+" "+total);
		}
		else
		{
			System.out.println("error");
		}
	}

	public static void main(String[] args) {
		
		Shoping sh=new Shoping();
		sh.acceptdetails(1, "book", 00, 25);
		sh.calculatebill();
		sh.display();
		

	}

}
