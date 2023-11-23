/*package string.conversions;

public class StringToChar {

	public static void main(String[] args) {
		String str = "Hema";
		char c = str.charAt(0);           
		System.out.println(c);  
		System.out.println(str.toCharArray()); 

	}

}*/



//Char to String:
package string.conversions;

public class StringToChar {

	public static void main(String[] args) {
		char c = 'H';   
		String s = String.valueOf(c);
		String s1 = Character.toString(c);
		System.out.println("Method 1: "+s); 
		System.out.println("Method 2: "+s1);

	}

}
