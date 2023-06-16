package Polymorphism;

public class ArithOperation {
	
	int add;
	float sub;
	float div;
	double mul;
	
	public void calculate(int a,int b)
	{
		add=a+b;
	}
	public void calculate(int a,float b)
	{
		sub=(float)(a-b);
	}
	public void calculate(float a,float b)
	{
		div=(float)(a/b);
	}
	public void calculate(double a, float b)
	{
		mul=(double)a*b;
	}
	
	public void dakhava()
	{
		System.out.println(add+"  "+sub+"  "+div+"  "+mul);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArithOperation ao=new ArithOperation();
		ao.calculate(650, 70);
		ao.calculate(52.2, 50f);
		ao.calculate(40f, 5f);
		ao.calculate(6000, 5f);
		
		ao.dakhava();
		

	}

}
