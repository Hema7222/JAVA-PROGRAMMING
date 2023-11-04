//string to char array reverse:

/*package class1_program;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str=s.next();
		int length=str.length();
		char ch[]=str.toCharArray();
			if(length%2==0)
				for(int i=0;i<ch.length;i++) 
				{
					System.out.printf("%c%c",ch[i+1],ch[i]);
					i++;
				}
			else 
				for(int i=0;i<ch.length-1;i+=2)
				{
					System.out.printf("%c%c",ch[i+1],ch[i]);
				}
			System.out.println(ch[length-1]);
		s.close();

	}

}*/




/*Given 3 numbers N , L and R. Print 'yes' if N is between L and R else print 'no'.
Sample Testcase :1
INPUT
3
2 6
OUTPUT
yes*/

/*package class1_program;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n,l,r;
		n=s.nextInt();
		l=s.nextInt();
		r=s.nextInt();
		if(l>n && r<n)
		{
			System.out.println("yes");
		}
		else
			System.out.println("No");
		s.close();
	}
}*/


//get num, get the tickets in array elements, and date of the month --> if the tickets divisible by 
//date of month then, print 1 else 0.

/*package class1_program;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n,k;
		n=s.nextInt();
		k=s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
			if(arr[i]%k==0)
			{
				System.out.print("1 ");
			}
			else
			{
				System.out.print("0 ");
			}
		}
		s.close();
	}
}*/





/*Given an array of N elements switch(swap) the element with the adjacent element and print the output.
Sample Testcase :
INPUT
5
3 2 1 2 3
OUTPUT
2 3 2 1 3*/

/*package class1_program;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		if(n%2==0)
			for(int i=0;i<n;i+=2) 
			{
				//System.out.printf("%d %d ",arr[i+1],arr[i]);
				System.out.print(arr[i+1]+" "+arr[i]+" ");
			}
		else
			for(int i=0;i<n-1;i+=2)
			{
				//System.out.printf("%d %d ",arr[i+1],arr[i]);
				System.out.print(arr[i+1]+" "+arr[i]+" ");
			}
		System.out.println(arr[n-1]);
		s.close();
	}
}*/


//reverse word using split method
/*package class1_program;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str=s.nextLine();
		String str1[]=str.split(" ");
		//int a = Integer.parseInt(str1[0]);
		//int b = Integer.parseInt(str1[1]);
		System.out.println(str1[1]+" "+str1[0]);
		s.close();
	}
}*/



//perfect square:

package class1_program;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		double n1=a*b;
		n1 = Math.sqrt(n1);
		if(n1%1==0)
		{
			System.out.println("yes");
		}
		else
			System.out.println("No");
		s.close();
	}
}



/*Given 2 numbers N and M add both the numbers and check whether the sum is odd or even.
Sample Testcase :
INPUT
9 2
OUTPUT
odd*/
/*package class1_program;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int sum=0;
		sum=a+b;
		if(sum%2==0)
		{
			System.out.println("Even");
		}
		else
			System.out.println("Odd");
		s.close();
	}
}*/



/*Find the minimum among 10 numbers.
Sample Testcase :
INPUT
5 4 3 2 1 7 6 10 8 9
OUTPUT
1*/

/*package class1_program;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int min=arr[0];
		for(int i=0;i<n;i++)
			if(min>arr[i])
				min=arr[i];
		System.out.println("Min Number: "+min);
		
		
		s.close();
	}
}*/