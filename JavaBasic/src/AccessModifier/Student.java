package AccessModifier;

public class Student {
	
	private int rollno;
	protected int admnum;
	int age;
	public int courseid;
	
	private int doprivate() 
	{
		rollno=50;
		return rollno;
	}
	
	protected int doprotected()
	{
		admnum=123456;
		return admnum;
	}
	int dodefault()
	{
		age=21;
		return age;
	}
	public int dopublic()
	{
		courseid=1230;
		return courseid;
	}
	
//	public void Stud(int rollno,int admnum,int age,int courseid) 
//	{
//		this.rollno=12;
//		this.admnum=20;
//		this.age=25;
//		this.courseid=40;
//		
//		
//	}
//	public void show()
//	{
//		System.out.println(rollno+" "+admnum+" "+age+" "+courseid);
//	}
	

	public static void main(String[] args) {



		Student s=new Student();
		System.out.println(s.doprivate());
		System.out.println(s.doprotected());
		System.out.println(s.dodefault());
		System.out.println(s.dopublic());

	}

}
