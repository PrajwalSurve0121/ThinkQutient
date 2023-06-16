package All_Practice;

import AccessModifier.Student;



public class OtherPackageStudent extends Student
{
	
	public void checkStudentVariableAccess()
	{
//		OtherPackageStudent s=new OtherPackageStudent();
		admnum=121;
		courseid=10234;
		System.out.println(admnum+" "+courseid);
	}
	public void checkStudentMethodAccess()
	{
		
//		OtherPackageStudent sp=new OtherPackageStudent();
		doprotected();
		dopublic();
		
		
	}

	public static void main(String[] args) {


		OtherPackageStudent ops=new OtherPackageStudent();
		ops.checkStudentVariableAccess();
		ops.checkStudentMethodAccess();
		
		
		

	}

}
