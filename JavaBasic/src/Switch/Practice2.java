package Switch;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// Write code to check given character is vowels
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the character-");
		
		char ch=sc.next().charAt(0);
		
		switch(ch) {
		
		case 'a': System.out.println("The given character is vowel");
		break;
		case 'e': System.out.println("The given character is vowel");
		break;
		case 'i': System.out.println("The given character is vowel");
		break;
		case 'o': System.out.println("The given character is vowel");
		break;
		case 'u': System.out.println("The given character is vowel");;
		break;
		default:System.out.println("Invalid Character");
		
		}
		sc.close();

	}

}
