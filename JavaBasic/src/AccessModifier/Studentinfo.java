package AccessModifier;

public class Studentinfo {
	
	  
	public static void main(String[] args) {
		
		Student s=new Student();
		System.out.println(s.doprotected());
		System.out.println(s.dodefault());
		System.out.println(s.dopublic());
		

	}

}
