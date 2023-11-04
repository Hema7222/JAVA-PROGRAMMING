package Array_Program;

import java.util.Scanner;

public class Largest_element {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		int max=arr[0];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
			if(arr[i]>max)
				max=arr[i];
		System.out.println("Largest element: "+max);
		s.close();

	}

}
