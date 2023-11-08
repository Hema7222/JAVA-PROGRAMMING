package Array_Program;

public class Palindrome {

	public static void main(String[] args) {
		String arr[]= {"racecar","malayalam","eample","encapsulation"};
		for(int i=0;i<arr.length;i++)
		{
			StringBuffer sb = new StringBuffer(arr[i]);
			if(arr[i].equalsIgnoreCase(sb.reverse().toString()))
				System.out.println("Palindrome");
			else
				System.out.println("Not a Palindrome");
		}
		

	}

}
