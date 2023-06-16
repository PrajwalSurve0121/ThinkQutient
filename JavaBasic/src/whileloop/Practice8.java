package whileloop;

public class Practice8 {

	public static void main(String[] args) {
		//Write code to display number between 1 to 30 skip the number which are divisible by 3 
		System.out.println("Enter the number");
		int i=1;
		while (i<=30)
		{
			if(i%3==0) {
				i++;
				continue;
			}
			
			System.out.println(i);
			i++;
		}
		

	}

}
