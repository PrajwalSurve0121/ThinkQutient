package Method;

public class Student2 {
	
	int id;
	String name;
	int phy;
	int maths;
	int eng;
	int marathi;
	int hindi;
	double per;
	
	public void acceptdetails(int sid,String sname,int s1,int s2,int s3,int s4,int s5)
	{
		id=sid;
		name=sname;
		phy=s1;
		maths=s2;
		eng=s3;
		marathi=s4;
		hindi=s5;
		
	}
	
	public void calculatepercentage()
	{
		per=(phy+maths+eng+marathi+hindi)/5;
		
	}
	
	public void display()
	{
		System.out.println(id+" "+name+" "+phy+" "+maths+" "+eng+" "+marathi+" "+hindi+" "+per);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student2 stud=new Student2();
		stud.acceptdetails(1,"Prajwal",55,60,70,65,95);
		stud.calculatepercentage();
		stud.display();
		

	}

}
