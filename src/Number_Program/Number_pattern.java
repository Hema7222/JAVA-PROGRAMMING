/*package Number_Program;

import java.util.Scanner;

public class Number_pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		s.close();

	}

}*/



/*package Number_Program;

import java.util.Scanner;

public class Number_pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)                           // 1
		{                                               // 12
			for(int j=1;j<=i;j++)                       // 123
			{                                           // 1234
				System.out.print(j);                    // 12345
			}
			System.out.println();
		}
		s.close();

	}

}*/


package Number_Program;

import java.util.Scanner;

public class Number_pattern {

	public static void main(String[] args) {                       // 12345
		Scanner s = new Scanner(System.in);                        // 1234
		System.out.println("Enter the Number: ");                  // 123
		int n=s.nextInt();                                         // 12
		for(int i=n;i>=1;i--)                                      // 1
		{
			for(int j=1;j<=i;j++)
			//for(int j=n;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		s.close();

	}

}


//HW1
/*package Number_Program;

import java.util.Scanner;

public class Number_pattern {

	public static void main(String[] args) {                       
		Scanner s = new Scanner(System.in);                        
		System.out.println("Enter the Number: ");                 
		int n=s.nextInt();                                         
		for(int i=5;i>=1;i--)                                     
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=2;i<=n;i++)                                     
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		s.close();

	}

}*/



//HW2
/*package Number_Program;

import java.util.Scanner;

public class Number_pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||i==n||j==1||j==n)
				{
					System.out.print("4");
				}
				else if(i==2||i==4||j==2||j==4)
					System.out.print("3");
				else
					System.out.print("2");
			}
			System.out.println();
			
		}
		s.close();

	}

}*/


