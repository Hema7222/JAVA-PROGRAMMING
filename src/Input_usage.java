import java.util.Scanner;

public class Input_usage {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		String str1;
		System.out.println("Enter the value of a: ");
		a = s.nextInt();
		System.out.println("Enter the String: ");
		str1=s.next();
		System.out.println("Value of a is "+a);
		System.out.println("Value of str1 is "+str1);
		s.close();
	}

}
