/*package Number_Program;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=s.nextInt();
		int rem,sum=0,temp=n;
		while(n>0)
		{
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
			
		}
		System.out.println("sum: "+sum);
		if(temp==sum)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
		s.close();

	}

}*/


//String reverse:
package Number_Program;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str=s.next();
		StringBuffer sb = new StringBuffer(str);
		if(str.equalsIgnoreCase(sb.reverse().toString()))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
		
		s.close();
	}
}
