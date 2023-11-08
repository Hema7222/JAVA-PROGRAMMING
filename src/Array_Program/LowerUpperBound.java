package Array_Program;

public class LowerUpperBound {

	public static void main(String[] args) 
	{
		int arr[]= {9,10,12,22,49,58,78,100};
		//System.out.println("Enter the number: ");
		
		int i=0;
		int val = 58;
		recursive(arr,val,i,i+1);

	}

	private static void recursive(int[] arr,int val, int i, int j)
	{
		if(arr.length==(i+1)) 
		{
			return;
		}
		if(arr[i] < arr[j])
		{
			if(arr[i]==val)
			{
				System.out.println("Lower Bound: "+i);
				System.out.println("Upper Bound: "+(i+1));
			}
			
			else
			{
				//System.out.println("Value is not  sorted");
				
			recursive(arr,val,i+1,j+1);}
		}
		else
		{
			System.out.println("Not sorted array");
		}
	}
}


