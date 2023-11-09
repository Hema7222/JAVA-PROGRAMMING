//Main Program:
package Array_Program;

import java.util.LinkedList;

public class Palindrome {
	public LinkedList<String> palindrome(String arr[]){
		LinkedList<String> res = new LinkedList<String>();
		for(int i=0;i<arr.length;i++)
		{
			StringBuffer sb = new StringBuffer(arr[i]);
			if(arr[i].equalsIgnoreCase(sb.reverse().toString()))
				res.add(arr[i]);
		}
		return res;
	}

}
