package Method;

public class Employee {
	
	int id;
	String name;
	float salary;

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.id=1;
		emp.name= "Ram";
		emp.salary=15100;
		System.out.println(emp.id +" " +emp.name+" " +emp.salary);
		
		Employee emp2=new Employee();
		emp2.id=2;
		emp2.name="Lakhan";
		emp2.salary=120000;
		System.out.println(emp2.id +" " +emp2.name+" " +emp2.salary);

	}

}
