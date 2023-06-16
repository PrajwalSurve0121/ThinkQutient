package Constructor;

class Subcourse
{
	int subCourseId;
	String subCourseName;
	
	Subcourse()
	{
//		this.show();
		System.out.println(subCourseId+ subCourseName);
	}
	
	public void show()
	{
		System.out.println(subCourseId+ subCourseName);
	}
}

public class Course {
	
	int id;
	String name;
	String Subcourse;
	
	Course()
	{
		System.out.println(id +name    +Subcourse);
	}
	

	

	public static void main(String[] args) {
		
		
		Subcourse sb=new Subcourse();
		Course c=new Course();
		
		
//		c.Subcourse();
//		c.Subcourse();
		

	




	
	}

}
