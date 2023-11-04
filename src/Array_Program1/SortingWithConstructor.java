package Array_Program1;

//Class Name:
public class SortingWithConstructor {
	int[] a;             //Instance Variable a: used to store an array that u pass to the constructor
	
	//class name and constructor 
	//name should be same
	public SortingWithConstructor(int arr[]){         //constructor takes integer arr as a parameter.
		this.a=arr;                                   // "this" keyword refers to the instance variable.
	}
	public void sort() {
		int arr[]= {10,5,3,2};
		//int n=arr.length;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				int temp=arr[i+1];
				arr[i+1]=arr[i];
				arr[i]=temp;
				i=-1;
			}
		}
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
	public void sort1(int[] arr) {
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				int temp=arr[i+1];
				arr[i+1]=arr[i];
				arr[i]=temp;
				i=-1;
			}
		}
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
}
