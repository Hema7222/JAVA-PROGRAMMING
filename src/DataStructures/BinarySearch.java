package DataStructures;

//search key elements from multiple element like by choosing the mid value, left and right
public class BinarySearch {

	public int bs(int arr[], int search) {
		
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
				
				return mid;
			}
			else
				right = mid-1;
		}
		return -1;
	}

}
