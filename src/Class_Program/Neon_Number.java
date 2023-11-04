package Class_Program;

import java.util.Scanner;

public class Neon_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=s.nextInt();
		int rem,sum=0;                             //temp=n                                           
		double squareroot = Math.sqrt(n);          //n=n*n;
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			sum=sum+rem;
		}
		System.out.println(sum);
		System.out.println("n=" +n);
		                                           //if(temp==sum)
		if(squareroot%1==sum)
		{
			System.out.println("Neon Number");
		}
		else
		{
			System.out.println("Not a Neon Number");
		}
		s.close();

	}

}
