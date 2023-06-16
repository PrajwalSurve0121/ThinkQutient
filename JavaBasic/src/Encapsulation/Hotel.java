package Encapsulation;

class Menu{
	
	private int m_id;
	private String menu_name;
	private int price;
	
    
	Menu(int m_id,String menu_name,int price)
	{
		this.m_id=m_id;
		this.menu_name=menu_name;
		this.price=price;
	}
//	public void dakhav()
//	{
//		System.out.println(m_id+" "+menu_name+" "+price);
//	}
	public String toString()
	{
		return m_id+" "+menu_name+" "+price;
	}
}



public class Hotel {
	private int id;
	private String hotel_name;
	private Menu menu_item;  
	
	public Hotel(int id,String hotel_name,Menu menu_item)
	{
		this.id=id;
		this.hotel_name=hotel_name;
		this.menu_item=menu_item;
	}
//	public void dakhvana()
//	{
//		System.out.println(id+" "+hotel_name+" "+menu_item);
//	}
	
	public String toString()
	{
		return id+" "+hotel_name+" "+menu_item;
	}
	

	public static void main(String[] args) {
		
//		Menu b=new Menu(12,"PavBhaji",1600);
//		Hotel a=new Hotel(103, "Westin", b);
//		System.out.println(a);
		
		Hotel a=new Hotel(103,"Westin",new Menu(12,"Noodles",2000));
		System.out.println(a);

	}

}
