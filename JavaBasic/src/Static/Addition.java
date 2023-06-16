package Static;

public class Addition {
	
	static int a=50;
	int b=40;
	
	public static int add()
	{
		Addition dd=new Addition();
		int add=a+dd.b;
		return add;
	}
	public void display()
	{
		Addition c=new Addition();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c.add());
		  
	}

	public static void main(String[] args) {
		
		Addition l=new Addition();
		l.display();



	}

}
