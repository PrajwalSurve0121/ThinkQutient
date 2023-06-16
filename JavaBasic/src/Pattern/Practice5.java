package Pattern;

public class Practice5 {

	public static void main(String[] args) {
		// Pattern for alphabet down
		for (char i='A';i<='Z';i++)
		{
			for (char j='Z';j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
