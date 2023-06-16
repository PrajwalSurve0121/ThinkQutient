package forloop;

public class Practice8_1to5 {

	public static void main(String[] args) {
		int table=0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=10;j++) {
				table=i*j;
				System.out.println(table);
			}
			System.out.println();
		}

	}

}
