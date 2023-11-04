package Class_Program;

import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		/* 0 1 1 2 3 5 8 13 
		 f1=0, f2=1, f3=f1+f2 : f3=1, f4= 2, f5=3, f6=5
		 
		 f1=f2 --> f1=1
		 f2=f3 --> f2=1
		 f3 = f1+f2 = 1+1 = 2
		 f1=f2 --> f1=1
		 f2=f3 --> f2=2 
		 f3 = f1+f2 = 1+2 = 3
		 */
		System.out.print("Enter the total number of generation: ");
		int n=s.nextInt();
		int f1=0,f2=1,f3;
		System.out.print(f1+" "+f2+" ");
		for(int j=3;j<=n;j++)
		{
			f3=f1+f2;
			System.out.print(f3+" ");
			f1=f2;
			f2=f3;
		}
		s.close();
	}

}
