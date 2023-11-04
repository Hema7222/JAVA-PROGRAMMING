package Class_Program;

import java.util.Scanner;

public class Amstrong_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=s.nextInt();
		int r,sum=0,temp=n;
		String str = String.valueOf(n);
		int l=str.length();
		while(n>0)
		{
			r=n%10;
			sum=(int) (sum + Math.pow(r, l));
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("Amstrong Number");
		}
		else
		{
			System.out.println("Not an Amstrong Number");
		}
		s.close();

	}

}
