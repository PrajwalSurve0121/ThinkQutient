package Nested_if_else;

public class Practice5_prime1to5 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=10;i++)
		{
			boolean isprime=true;
			for (int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					isprime=false;
					break;
				}
			}
			if(isprime==true)
			{
				System.out.println(i);
			}
				
		}

	}

}
