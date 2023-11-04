package Class_Program;

import java.util.Scanner;

public class Tech_number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int n=s.nextInt();
		int l=0,num;
		String str = String.valueOf(n);
		l=str.length();
		if(l==4)
		{
			num=(n/100) + (n%100);
			if((num*num) == n)
			{
				System.out.println("Tech Number");
			}
			else
			{
				System.out.println("Not a Tech Number");
			}
			
		}
		else
		{
			System.out.println("Invalid");
		}
		s.close();
		

	}

}
