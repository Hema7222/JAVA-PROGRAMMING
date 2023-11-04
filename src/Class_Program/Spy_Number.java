package Class_Program;

import java.util.Scanner;

public class Spy_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=s.nextInt();
		int sum=0,product=1,rem;
		
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			sum=sum+rem;
			product=product*rem;
		}
		if(sum==product)
		{
			System.out.println("Spy Number");
		}
		else
		{
			System.out.println("Not a Spy Number");
		}
		s.close();

	}

}
