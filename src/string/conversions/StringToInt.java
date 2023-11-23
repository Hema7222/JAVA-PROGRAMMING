package string.conversions;

public class StringToInt {

	public static void main(String[] args) {
		String str = "200";
		//1st method:
		int i = Integer.parseInt(str);
		//2nd method:
		int j = Integer.valueOf(str);
		System.out.println(i);
		System.out.println(j);

	}

}
