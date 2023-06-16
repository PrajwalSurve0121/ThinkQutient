package All_Practice;

class Dept
{
	private int dept_id;
	private String dept_name;
	
	Dept(int dept_id,String dept_name)
	{
		this.dept_id=dept_id;
		this.dept_name=dept_name;
	}
	private void showdeptdetails()
	{
		System.out.println(dept_id+" "+dept_name);
	}
}
class Mydate
{
	private int day;
	private int month;
	private int year;
	
	Mydate(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	private void showdatedetails()
	{
		System.out.println(day+" "+month+" "+year); 
	}
}

public class Employee {
	
	private int id;
	private String name;
	private float salary;
	private Dept dep;
	private Mydate mdate;
	
	private Employee(int id,String name,float salary,Dept dep,Mydate mdate)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.dep=dep;
		this.mdate=mdate;
	}
	
	private void sempdetails()
	{
		System.out.println(id+" "+name+" "+salary+" "+dep+" "+mdate);
	}

	public static void main(String[] args) {
		
		Dept de=new Dept(201, "Finance");
		Mydate md=new Mydate(28, 11, 1999);
		Employee emp=new Employee(12, "Prajwal", 2154527, de, md);
		emp.sempdetails();
		
	}

}
