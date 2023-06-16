package Method;

public class Car {
	
	int modelno;
	String carname;
	int mileage;
	int price;
	
	public void acceptcardetails(int mno,String cname,int mi,int pri)
	{
		modelno=mno;
		carname=cname;
		mileage=mi;
		price=pri;
	}
	
	public void showcar()
	{
		System.out.println(modelno+" "+carname+" "+mileage+" "+price);
	}
	

	public static void main(String[] args) {
		
		Car car=new Car();
		car.acceptcardetails(564,"Rolls Royce", 10,1000000000);
		car.showcar();
	}

}
