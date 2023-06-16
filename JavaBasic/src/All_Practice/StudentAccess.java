package All_Practice;

import AccessModifier.Student;
import AccessModifier.TQPPStudent;

public class StudentAccess 
{

	public static void main(String[] args) {


		Student stude=new Student();
		stude.courseid=14;
		stude.dopublic();
		System.out.println(stude.dopublic());
		
		
		TQPPStudent t=new TQPPStudent();
		t.courseid=1254;
		t.dopublic();
		System.out.println(t.dopublic());
		
		StudentAccess sa=new StudentAccess();
		
		

	}

}
