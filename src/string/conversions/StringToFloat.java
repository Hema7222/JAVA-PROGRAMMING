/*package string.conversions;

public class StringToFloat {

	public static void main(String[] args) {
		String s = "45.5";
		float f = Float.parseFloat(s);
		System.out.println(f);

	}

}*/



//Float to String:
package string.conversions;

public class StringToFloat {

	public static void main(String[] args) {
		float f = (float) 45.5;                //float f = 45.5F; 
		String s = String.valueOf(f);
		System.out.println(s);

	}

}
