package AccessModifier;

public class TQPPStudent extends Student
{
	public void checkStudentVariableAccess()
	{
		Student sa=new Student();
		sa.courseid=12;
		sa.admnum=1023;
		sa.age=22;
//		sa.rollno=121;  Private
		
		System.out.println(sa.courseid+" "+sa.admnum+" "+sa.age); 
	}
	public void checkStudentMethodAccess()
	{
		Student s=new Student();
		s.dodefault();
		s.doprotected();
		s.dopublic();
		
	}

	public static void main(String[] args) {
		
		TQPPStudent t=new TQPPStudent();
		t.checkStudentVariableAccess();
		t.checkStudentMethodAccess();
				

	}

}
