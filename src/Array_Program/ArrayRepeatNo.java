//To print repeated elements in an array:
package Array_Program;
import java.util.Scanner;

public class ArrayRepeatNo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[]= {7,8,12,6,3,4,1,9,7,6,1,4};
		System.out.print("{");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
				if(arr[i]==arr[j])
				{
					System.out.print(arr[i]+" ");
					break;
				}
		}
		System.out.print("}");
		s.close();
	}

}
