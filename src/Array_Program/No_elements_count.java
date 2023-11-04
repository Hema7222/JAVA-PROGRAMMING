package Array_Program;

import java.util.Scanner;

public class No_elements_count {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int arr[] = new int[n];
		int count=0;
		for(int i=0;i<n;i++)
		
			arr[i]=s.nextInt();
			System.out.println("enter the element to " +" count no. of occurence: ");
		
		int search=s.nextInt();
		for(int i=0;i<n;i++)
		{
			
			if(arr[i]==search)
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println("No.of occurence: "+count);
		}
		else
			System.out.println("No. of occurence: "+count);
		s.close();

	}

}
