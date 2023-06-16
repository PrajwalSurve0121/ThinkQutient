package Method;

public class Student1 {
	int id;
	String name;
	String city;
	double per;
	
	public void acceptDetails(int sid,String sname,String ct,double p)
	{
		id=sid;
		name=sname;
		city=ct;
		per=p;
		
	}
	public void display()
	{
		System.out.println(id+" "+name+" "+city+" "+per);
	}
	

	public static void main(String[] args) {
	
		Student1 stud1=new Student1();
		stud1.acceptDetails(101,"rajesh","pune",56.45);
		stud1.display();
		
		Student1 stud2=new Student1();
		stud2.acceptDetails(102,"Neha","Mumbai",89.45);
		stud2.display();

	}


}


