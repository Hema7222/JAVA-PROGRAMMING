package string.conversions;

public class IntToString {

	public static void main(String[] args) {
		int i = 200;
		String s = String.valueOf(i);
		System.out.println(s+100);          //concat --> 200100
		System.out.println(i+100);          //add --> now its 300
	}

}
