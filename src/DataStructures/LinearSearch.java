package DataStructures;
//Recursion is best solution to avoid n number of loops
public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = {10,2,30,40,50,60,70,80,90,100};
		int search = 80;
		for(int i=0;i<arr[i];i++) {
			if(arr[i]==search)
			{
				System.out.println(+search+ " found at index position: "+i);
				break;
			}
			
		}

	}

}
