package All_Practice;

class Department
{
	private String name;
	private int dept_id;
	private Mydatee mdate;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setDept_id(int dept_id)
	{
		this.dept_id=dept_id;
	}
	public void setMydate(Mydatee mdate)
	{
		this.mdate=mdate;
	}
	public String getName()
	{
		return name;
	}
	public int getDept_id()
	{
		return dept_id;
	}
	public Mydatee getMdate()
	{
		return mdate;
	}
	public void displaydeptdeatils()
	{
		System.out.println(name+" "+dept_id+" "+mdate);
	}
}
class Mydatee
{
	private int day;
	private int month;
	private int year;
	
	public void setDay(int day)
	{
		this.day=day;
	}
	public void setMonth(int month)
	{
		this.month=month;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	public int getDay()
	{
		return day;
	}
	public int getMonth()
	{
		return month;
	}
	public int getYear()
	{
		return year;
	}
	public void didplaymydatedetails()
	{
		System.out.println(day+" "+month+" "+year);
	}
}

public class Employeegettersetter {
	
	private int id;
	private String name;
	private float salary;
	private Department dep;
	private Mydatee mdate;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSalary(float salary)
	{
		this.salary=salary;
	}
	public void setDepartment(Department dep)
	{
		this.dep=dep;
	}
	public void setMdate(Mydatee mdate)
	{
		this.mdate=mdate;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public float getSalary()
	{
		return salary;
	}
	public Department getDepartment()
	{
		return dep;
	}
	public Mydatee getMdate()
	{
		return mdate;
	}
	
	public void display()
	{
		System.out.println(id+" "+name+" "+salary+" "+dep+" "+mdate);
	}
	
	

	public static void main(String[] args) {
		
		Employeegettersetter emp=new Employeegettersetter();
		emp.setId(123);
		emp.setName("Ram");
		emp.setSalary(21454511);
		emp.getId();
		emp.getName();
		emp.getSalary();
		emp.setDepartment(new Department());
		Department d=emp.getDepartment();
		d.setName("Developer");
		d.setDept_id(1457);
		d.getName();
		d.getDept_id();
		d.setMydate(new Mydatee());
		Mydatee my=d.getMdate();
		my.setDay(28);
		my.setMonth(11);
		my.setYear(1999);
		my.getDay();
		my.getMonth();
		my.getYear();
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		System.out.println(emp.getDepartment());
		System.out.println(d.getName());
		System.out.println(d.getDept_id());
		System.out.println(my.getDay());
		System.out.println(my.getMonth());
		System.out.println(my.getYear());

	}

}
