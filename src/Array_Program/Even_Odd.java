//program to separate and print the even and odd no. from array elements
/*package Array_Program;

import java.util.Scanner;

public class Even_Odd {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=s.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements one by one: ");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.print("Odd numbers in the array: ");
		System.out.print("Odd: ");
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		
		//System.out.print("Even numbers in the array: ");
		System.out.print("\nEven: ");
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		
		s.close();

	}

}*/

//Time space and complexity
package Array_Program;

import java.util.Scanner;

public class Even_Odd {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();                         
		int arr[]=new int[n];                //create array at run time
		int odd[]=new int[n];               // odd={0,0,0,0,0}
		int even[]=new int[n];
		int even_index=0, odd_index=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) 
		{
			if(arr[i]%2==0)
		       even[even_index++]=arr[i];
			else 
				odd[odd_index++]=arr[i];
		}
		System.out.print("Odd: ");
		
		//for(int i=0;i<n;i++)
		for(int i=0;i<odd_index;i++)
			//if(arr[i]!=0)
				System.out.print(odd[i]+" ");
		System.out.print("\nEven: ");
		
		//for(int i=0;i<n;i++)
		for(int i=0;i<even_index;i++)
			//if(arr[i]!=0)
				System.out.print(even[i]+" ");
		s.close();
		}
	}
