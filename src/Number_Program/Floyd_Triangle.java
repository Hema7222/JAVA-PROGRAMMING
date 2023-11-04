package Number_Program;

import java.util.Scanner;

public class Floyd_Triangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=s.nextInt();
		int k=1;
		for(int i=1;i<=n;i++)
		{
			for(int space=n; space>i;space--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(k++ +" ");
			}
			System.out.println();
		}
		s.close();
	}

}
