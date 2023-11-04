package Array_Program;

import java.util.Scanner;

public class Second_Largest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no. of elements in array:");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the no. of array elements: ");
		int temp=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])       // check first two elements in an array and it continues..
				{
					temp=arr[i];      // after checking it will swap the 1st two elements if it is > 1st element
					arr[i]=arr[j];    // and it continues..
					arr[j]=temp;
				}
			}
			
		}
		System.out.println("Second Largest: "+arr[n-2]);
		System.out.println("Smallest: "+arr[0]);
		s.close();

	}

}
