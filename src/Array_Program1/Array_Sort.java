package Array_Program1;

public class Array_Sort {
	

	public static void main(String[] args) {
		int arr[]= {10,5,3,2};
		
		Main1 s = new Main1();
		s.sort();
		s.sort1(arr);
		/*SortingWithConstructor sortingwithconstructor = new SortingWithConstructor(arr);
		sortingwithconstructor.sort();
		sortingwithconstructor.sort1(arr);*/
	}
}


//Bubble Sort:

/*package Array_Program1;
import java.util.Scanner;
public class Array_Sort {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[]= {10,5,3,2};
		int n=arr.length;
		for(int i=0;i<arr.length;i++)
		{
			//System.out.println("arr[i]: " +i);
		for(int j=i+1;j<arr.length;j++)
		{
			//System.out.println(arr[j]);
			if(arr[i]>arr[j])
			{
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				//System.out.println("temp: "+temp);
			}
		}
		}
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		s.close();
	}
}*/
