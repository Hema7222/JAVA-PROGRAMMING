package Class_Program;

import java.util.Scanner;

public class switch_case {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char ch = s.next().charAt(0);
		switch(ch) 
		{
		case 'a':
		case 'A':
			//System.out.println("Vowel");
			//break;
		case 'e':
		case 'E':
			//System.out.println("Vowel");
			//break;
		case 'i':
		case 'I':
			//System.out.println("Vowel");
			//break;
		case 'o':
		case 'O':
			//System.out.println("Vowel");
			//break;
		case 'u':
		case 'U':
			System.out.println("Vowel");
			break;
			default:
				System.out.println("Not a Vowel");
		}
		s.close();

	}

}
