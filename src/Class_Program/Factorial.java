package Class_Program;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int result=1;
		for(int i=n; i>=1; i--)
		{
			result = result*i;
		}
		System.out.println(result);
		s.close();

	}

}

