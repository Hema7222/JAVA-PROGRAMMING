package Array_Program;
import java.util.Scanner;
public class Basic_Array {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		/*int[] arr = {10, 20, 30, 40, 50};
		for(int index=0;index<arr.length;index++)
		{
			System.out.println("arr["+index+"]="+arr[index]);
			    //   arr[0]=10
		}*/
		
		//To get input from user:
		
		System.out.println("Enter the number of elements: ");
		int n=s.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements one by one: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Array elements are stored in memory: ");
		for(int i=0;i<n;i++)
		{
			if(i==n-1)
			{
				System.out.print(arr[i]);
			}
			else
			{
				System.out.print(arr[i]+",");
			}
		}
		s.close();
	}
}
