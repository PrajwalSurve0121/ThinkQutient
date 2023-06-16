  package Static;

public class StatAddition {
	static int a=50;
	int b=60;
	
	
	public static int addition()
	{
		StatAddition x=new StatAddition();
		int addition= a+x.b;
		return addition;
		
		
	}
	
	public void showdata()
	{
		
		StatAddition add=new StatAddition();
		System.out.println((add.a));
		System.out.println(b);
		System.out.println(add.addition());
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StatAddition p=new StatAddition();
		p.showdata();
		StatAddition.addition();
	}

}
