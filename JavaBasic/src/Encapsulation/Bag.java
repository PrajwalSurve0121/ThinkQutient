package Encapsulation;

class Pen
{
	private String pname;
	private String pcolor;
	private int pprice;
	private Nib n;
	
	public void setPname(String pname)
	{
		this.pname=pname;
	}
	public void setPcolor(String pcolor)
	{
		this.pcolor=pcolor;
	}
	public void setPprice(int pprice)
	{
		this.pprice=pprice;
	}
	public void setNib(Nib n)
	{
		this.n=n;
	}
	public String getPname()
	{
		return pname;
	}
	public String getPcolor()
	{
		return pcolor;
	}
	public int getPprice()
	{
		return pprice;
	}
	public Nib getNib()
	{
		return n;
	}
	
}
class Nib{
	private String material;
	private String type;
	private String ncolor;
	
	public void setMaterial(String material)
	{
		this.material=material;
	}
	public void setType(String type)
	{
		this.type=type;
	}
	public void setNcolor(String ncolor)
	{
		this.ncolor=ncolor;
	}
	public String getMaterial()
	{
		return material;
	}
	public String getType()
	{
		return type;
	}
	public String getNcolor()
	{
		return ncolor;
	}
}


public class Bag {
	private String bname;
	private String color;
	private int price;
	private Pen pe;
	
	public void setBname(String bname)
	{
		this.bname=bname;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public void setMypen(Pen pe)
	{
		this.pe=pe;
	}
	public String getBname()
	{
		return bname;
	}
	public String getColor()
	{
		return color;
	}
	public int getPrice()
	{
		return price;
	}
	public Pen getMypen()
	{
		return pe;
	}


	public static void main(String[] args) {
		
		Bag b=new Bag();
		b.setBname("Fasttrack");
		b.setColor("Black");
		b.setPrice(1500);
		b.getBname();
		b.getColor();
		b.getPrice();
		b.getMypen();
		
		
		b.setMypen(new Pen());
		Pen lo=b.getMypen();
		lo.setPname("Reynold");
		lo.setPcolor("Yellow");
		lo.setPprice(120);
		lo.getPname();
		lo.getPcolor();
		lo.getPprice();
		lo.getNib();
		
		
		lo.setNib(new Nib());
		Nib ib=lo.getNib();
		ib.setMaterial("Plastic");
		ib.setNcolor("Pink");
		ib.setType("Hard");
		
		
		System.out.println(b.getBname());
		System.out.println(b.getColor());
		System.out.println(b.getPrice());
		System.out.println(b.getMypen());
		System.out.println(lo.getPname());
		System.out.println(lo.getPcolor());
		System.out.println(lo.getPprice());
		System.out.println(lo.getNib());
		System.out.println(ib.getMaterial());
		System.out.println(ib.getType());
		System.out.println(ib.getNcolor());
	}
}
