/*package Array_Program;

import java.util.Scanner;

public class radius {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		//System.out.println("Enter the number: ");
		
		float r=s.nextFloat();
		float area=(float) (3.14*r*r);
		
		System.out.println(+area);
		
		s.close();

	}

}*/

/*package Array_Program;

import java.util.Scanner;

public class radius {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		String str=s.nextLine();
		String str1[]=str.split(" ");
		
		//int a=s.nextInt();
		//int b=s.nextInt();
		int a = Integer.parseInt(str1[0]);
		int b = Integer.parseInt(str1[1]);
		if(a>1&&a<=5&&b>=1&&b<=50)
			System.out.println((int)Math.pow(a,b)); 
		s.close();
	}
}*/


/*package Array_Program;

import java.util.Scanner;

public class radius {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		String str=s.nextLine();
		String str1[]=str.split(" ");
		//int b=s.nextInt();
		//int a=s.nextInt();
		//int c=s.nextInt();
		int a = Integer.parseInt(str1[0]);
		int b = Integer.parseInt(str1[1]);
		int c = Integer.parseInt(str1[2]);
		a=a*a;
		b=b*b;
		c=c*c;
		if(a<=10000&&b<=100000&&c<=100000)
		{
			System.out.println("yes");
		}
		else
			System.out.println("no");
		s.close();
	}
}*/



/*Given 2 numbers N and K followed by elements of N .Print 'yes' if K exists else print 'no'.
Sample Testcase :
INPUT
4 2
1 2 3 3
OUTPUT
yes*/
package Array_Program;

import java.util.Scanner;

public class radius {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		//int flag = 0;
		//int n = 0;
		int N=s.nextInt();
		int K=s.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i]=s.nextInt();
		}
		boolean found=false;
		for(int i=0;i<N;i++)
		{
			if(arr[i]==K) 
			{
				found=true;
				break;
			}
		}
		
		if(found)
		{
			System.out.println("yes");
		}
		else 
		{
			System.out.println("no");
		}
		s.close();
	}
}


