//HW1
package Number_Program;

import java.util.Scanner;

public class Alphabet_Pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=s.nextInt();
		char ch;
		for(int i=1;i<=n;i++)
		{
			ch='a';
			for(int space=1;space<i;space++)
			{
				
				System.out.print(" ");
			}
			//for(int j=n;j>=i;j--)
			for(int j=i;j<=n;j++)
			{
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
		s.close();

	}

}


/*package Number_Program;

import java.util.Scanner;

public class Alphabet_Pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("enter the number:");
		int n = s.nextInt();
		                                                   //    A
		char ch;                                           //   A B
		for(int i=1;i<=n;i++)                              //  A B C
		{                                                 //  A B C D
			ch='A';                                      //  A B C D E
			for(int space=n;space>i;space--)
				System.out.print(" ");
			for(int j=1;j<=i;j++) 
			{
				System.out.print(ch++ + " ");
			}
		System.out.println();
		}
		s.close();
	}
}*/



//HW2
/*package Number_Program;

import java.util.Scanner;

public class Alphabet_Pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=s.nextInt();
		char ch='A';                                      //     A
		                                                  //    B C
		for(int i=1;i<=n;i++)                             //   D E F
		{                                                 //  G H I J
			for(int space=n; space>i;space--)            //  K L M N O
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch++ +" ");
				
			}
			System.out.println();
		}
		s.close();

	}

}*/



/*package Number_Program;

import java.util.Scanner;

public class Alphabet_Pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("enter the number:");          //A
		int n = s.nextInt();                            //AB
		                                                //ABC
		char ch;                                        //ABCD
		for(int i=1;i<=n;i++)                           //ABCDE
		{
			ch='A';
			for(int j=1;j<=i;j++)
				System.out.print(ch++);
		
		System.out.println();
		}
		s.close();
	}
}*/



/*package Number_Program;

import java.util.Scanner;

public class Alphabet_Pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("enter the number:");
		int n = s.nextInt();                          //ABCDE
		                                              //ABCD
		char ch;                                      //ABC
		for(int i=1;i<=n;i++)                         //AB
		{                                             //A
			ch='A';
			for(int j=i;j<=n;j++)
				System.out.print(ch++);
		
		System.out.println();
		}
		s.close();
	}
}*/

