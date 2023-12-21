package Number_Program;

import java.util.Scanner;

public class Abundant_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
				sum=sum+i;
		}
		
		System.out.println("sum: "+sum);
		if(sum>n)
		{
			System.out.println("Abundant Number");
		}
		else
		{
			System.out.println("Not an abundant Number");
		}
		
		s.close();

	}

}



