package Constructor;

public class Employee {
	
	private String name;
	private int emp_id;
	private int sal;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setEmp_id(int emp_id)
	{
		this.emp_id=emp_id;
	}
	public void setSal(int sal)
	{
		this.sal=sal;
	}
	
	public String getName()
	{
		return name;
	}
	public int getEmp_id()
	{
		return emp_id;
	}
	public int getSal()
	{
		return sal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
