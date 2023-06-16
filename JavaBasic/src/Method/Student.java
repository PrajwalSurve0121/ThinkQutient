package Method;

public class Student {
	
	int id;
	String name;
	double per;
	String city;
	
	public void display()
	{
		System.out.println("This is my method");
	}
	
	public void addition(int x, int y)
	{
		System.out.println("Addition" +(x+y));
	}
	
	public int getdata()
	{
		int sal=60000;
		return sal;
	}

	public static void main(String[] args) {
		
		Student stud=new Student();
		stud.display();
		
		stud.addition(10, 15);
		int ans= stud.getdata();
		System.out.println("Salary" +ans);

	}

}
