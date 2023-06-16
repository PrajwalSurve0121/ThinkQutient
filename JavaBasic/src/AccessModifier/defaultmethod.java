package AccessModifier;

public class defaultmethod {
	
	static private int num=30;
	private int num2=50;
	static int num3=40;
	static int z =100;
	public int p=60;
	int myprivate;
	int addition;
	
	static int myprivat() // using void
	{
		defaultmethod x=new defaultmethod(); 
		int myprivate=num+x.num2+num3;
		return myprivate;
		
		
		//return myprivate;
		
	}
	
	    public int addition()
    {
    	
    	addition=num3+z+p+num;
    	return addition;
    }
    
    public void display()
    {
    	defaultmethod m=new defaultmethod();
    	System.out.println(this.addition());
    	     	
    }
 
	public static void main(String[] args) {


		defaultmethod dm=new defaultmethod();
		defaultmethod.myprivat();
		dm.addition();
		dm.display();

	}

}

