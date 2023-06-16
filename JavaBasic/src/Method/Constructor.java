package Method;

public class Constructor {
	
	 	public Constructor(){
	 		System.out.println("hello");
	 	}
	 	public Constructor(int num) {
	 		System.out.println(num);
	 	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor con= new Constructor(11);
		Constructor con2= new Constructor();
		

	}

}
