//Main Program
package Array_Program;

import java.util.LinkedList;

public class PrimeNumber {

	public LinkedList<Integer> prime(int arr[], int count){
		LinkedList<Integer> res = new LinkedList<Integer>();
		int loop=0;                      //To check how many times loop is running
		for(int i=0;i<arr.length;i++)
		{
			count=0;
			for(int j=2;j<arr[i]/2;j++)
			{
				if(arr[i]%j==0)
				{
					count=1;
					break;
				}
				loop++;                   //To continue the loop if the condition fails
			}
			if(count==0)
			{
				res.add(arr[i]);
			}
			
		}
		System.out.println(loop);
		return res;
	}
}
