package Class_Program;

import java.util.Scanner;

public class Sunny_number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=s.nextInt();
			double num =n+1;
			System.out.println("num= "+num);
			double squareroot = Math.sqrt(num);
			System.out.println("Squareroot number: "+squareroot);
			
		
		if((squareroot)%1==0)
		
		{
			System.out.println("Sunny number");
		}
		else
		{
			System.out.println("Not a Sunny Number");
		}
		s.close();
	}

}
