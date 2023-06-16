package Constructor;

public class Academyinfo {

	public static void main(String[] args) {
		
		Academy a=new Academy();
		a.setAname("ThinkQ Software Pvt Ltd");
		a.setLocation("Pune");
		a.setType("Engineering");
		a.setTotald(25);
		System.out.println(a.getAname());
		System.out.println(a.getLocation());
		System.out.println(a.getType());
		System.out.println(a.getTotald()  );

	}

}
