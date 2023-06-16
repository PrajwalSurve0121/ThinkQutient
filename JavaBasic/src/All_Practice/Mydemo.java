package All_Practice;

class A
{
	int i;
	String s;
	A(int i,String str)
	{
		this.i=i;
		s=str;
	}
}

public class Mydemo {

	public static void main(String[] args) {


		A a=new A(4,"ABC");
		System.out.println(a.i+a.s);
		

	}

}
