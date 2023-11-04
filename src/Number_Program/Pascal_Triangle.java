package Number_Program;

import java.util.Scanner;

public class Pascal_Triangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int space=n; space>i;space--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int k=i-1;k>=1;k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}
		s.close();
	}

}
