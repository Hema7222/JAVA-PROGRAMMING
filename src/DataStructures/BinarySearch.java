package DataStructures;

//search key elements from multiple element like by choosing the mid value, left and right
public class BinarySearch {

	public static void main(String[] args) {
		int arr[]= {2,5,7,9,10,14,17,19,24,30};
		int search=17;
		int left = 0;
		int right=arr.length-1;
		
		while(left<=right)
		{
			int mid=(left+right)/2;
			
			if(arr[mid]<search)
			{
				left=mid+1;
			}
			else if(arr[mid]==search)
			{
				System.out.println(search+" found at index position: " +mid);
				return;
			}
			else
				right = mid-1;
		}
		System.out.println("Not found");
	}

}
