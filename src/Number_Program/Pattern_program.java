//Right Triangle
/*package Number_Program;

import java.util.Scanner;

public class Pattern_program {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		s.close();

	}

}*/



//Inverted Right Triangle
/*package Number_Program;

import java.util.Scanner;

public class Pattern_program {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			//for(int j=n;j>=i;j--)                 //inner loop alone changes are there for inverted triangle.
			for(int j=i;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		s.close();

	}

}*/

//Both Triangle
/*package Number_Program;

import java.util.Scanner;

public class Pattern_program {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=2;i<=n;i++)                         //instead we can give i=2 and proceed
		{
			//for(int j=n-1;j>=i;j--)                 
			for(int j=i;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		s.close();

	}

}*/



//Pyramid
/*package Number_Program;

import java.util.Scanner;

public class Pattern_program {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int space=n;space>i;space--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		s.close();

	}

}*/


//Inverted Pyramid
package Number_Program;

import java.util.Scanner;

public class Pattern_program {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int space=1;space<i;space++)
			{
				System.out.print(" ");
			}
			//for(int j=n;j>=i;j--)
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		s.close();

	}

}


//diff
/*package Number_Program;

import java.util.Scanner;

public class Pattern_program {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int space=1;space<i;space++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		s.close();

	}

}*/




//diff
/*package Number_Program;

import java.util.Scanner;

public class Pattern_program {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int space=n;space>i;space--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		s.close();

	}

}*/


//diff
/*package Number_Program;

import java.util.Scanner;

public class Pattern_program {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();}
			for(int i=2;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
				}
			System.out.println();
		}
		s.close();

	}

}*/


//New Pattern
/*package Number_Program;

import java.util.Scanner;

public class Pattern_program {

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
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
			
		}
		s.close();

	}

}*/



//Diamond
/*package Number_Program;

import java.util.Scanner;

public class Pattern_program {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int space=n;space>i;space--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
			for(int i=1;i<=n;i++)
			{
				for(int space=1;space<i;space++)
				{
					System.out.print(" ");
				}
				//for(int j=n;j>=i;j--)
				for(int j=i;j<=n;j++)
				{
					System.out.print("* ");
				}
				
				System.out.println();
			}
			s.close();
		}
		
	}*/




//HW1 
/*package Number_Program;

import java.util.Scanner;

public class Pattern_program {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==i||i==n+1||j==1)
				{
					System.out.print("* ");
				}
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
		for(int i=2;i<=n;i++)                         //instead we can give i=2 and proceed
		{
			for(int j=i;j<=n;j++)                 
			{
				if(i==n-1||j==i||j==n)
				{
					System.out.print("* ");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		s.close();

	}

}*/




//HW2 --> Hollow diamond
/*package Number_Program;

import java.util.Scanner;

public class Pattern_program {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++)                            //no. of lines
		{
			for(int space=n;space>=i;space--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j==1||j==i||i==n)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
			for(int i=2;i<=n;i++)
			{
				for(int space=1;space<=i;space++)
				{
					System.out.print(" ");
				}
				for(int j=n;j>=i;j--)
				{
					if(j==n||i==1||j==i)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				
				System.out.println();
			}
			s.close();
		}
		
	}*/