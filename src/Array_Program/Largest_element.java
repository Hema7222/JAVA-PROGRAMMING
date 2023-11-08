// Largest Number in an array:
package Array_Program;

import java.util.Scanner;

public class Largest_element {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
			if(arr[i]>max)
				max=arr[i];
		System.out.println("Largest element: "+max);
		s.close();

	}

}
		


//To print Index Value:

/*package Array_Program;

import java.util.Scanner;

public class Largest_element {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[]= {9,7,8,6,3,1,12,2,5};
		int n=s.nextInt();
		for(int i=0;i<arr.length;i++)
		
		if(n==arr[i])
		{
			System.out.println("Index Value: "+i);          //LowerBound
		}
		s.close();

	}

}*/
