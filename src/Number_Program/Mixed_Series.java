// 1 2 2 4 6 6 24 8 120 10

/*package Number_Program;

import java.util.Scanner;

public class Mixed_Series {
		static void method(int n);
		int fact=1,num=1,even=2;
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				fact=1;
				for(int j=1;j<=num;j++)
				{
					fact=fact*j;
				}
				num++;
				System.out.print(fact+" ");
				
			}
			else
			{
				System.out.print(even+" ");
				even+=2;
			}
		}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		method(n);
		s.close();

	}

}*/


package Number_Program;

import java.util.Scanner;

public class Mixed_Series {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int odd=1,even=2;
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				System.out.print(odd+" ");
				odd+=2;
			}
			else
			{
				System.out.print(even+" ");
				even=even+1;
			}
			
			
		}
		s.close();
	}
}
