package Method;

public class Movie {
	int movieid;
	String mname;
	int cost;
	int ticketnum;
	int totalcost;
	int available;
	
	public void acceptdetails(int id,String name,int c,int tnum)
	{
		movieid=id;
		mname=name;
		cost=c;
		ticketnum=tnum;
	}
	
	public void costofticket()
	{
		totalcost=ticketnum*cost;
		available=15-ticketnum;
	}
	
	public void display()
	{
		System.out.println(movieid+" "+mname+" "+cost+" "+" "+ticketnum+" "+totalcost+" "+available);
	}
	

	public static void main(String[] args) {
		
		Movie mo=new Movie();
		mo.acceptdetails(5,"Ye baburao ka style hai",150,12);
		mo.costofticket();
		mo.display();
		
		
		



	}

}
