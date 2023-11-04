/*package Number_Program;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1, n2;
		int gcd=1;
		n1=s.nextInt();
		n2=s.nextInt();
		System.out.println("Enter the number: ");
		for(int i=1;i<=n1&&i<=n2;i++)
		{
			if(n1%i==0 && n2%i==0)
				gcd=i;
		}
		System.out.println("GCD of " +n1+ " and " +n2+ " is "+gcd);

	}

}*/


package Number_Program;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1, n2;
		int gcd=1;
		n1=s.nextInt();
		n2=s.nextInt();
		System.out.println("Enter the number: ");
		for(int i=1;i<=n1&&i<=n2;i++)
		{
			if(n1%i==0 && n2%i==0)
				gcd=i;
		}
		int lcm=(n1*n2)/gcd;
		System.out.println("gcd of " +n1+ " and " +n2+ " is "+gcd);
		System.out.printf("lcm of %d and %d is %d.",n1,n2,lcm);
		s.close();

	}

}