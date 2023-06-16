package Constructor;

public class EmployeeInfo {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setName("Prajwal");
		e.setEmp_id(121);
		e.setSal(100000000);
		e.getName();
		e.getEmp_id();
		e.getSal();
		System.out.println(e.getName());
		System.out.println(e.getEmp_id());
		System.out.println(e.getSal());

	}

}
