//String Class

/*package class1_program;

public class Prg1 {

	public static void main(String[] args) {
		String str1;
		String str2=new String();
		String str3=new String("Welcome");
		String str4;
		str1="India";
		str2="Japan";
		str3="hp";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		str4="today is monday and yesterday is sunday";
		System.out.println(str4.length());
		System.out.println("sudha".length());
		System.out.println(str4.charAt(4));
		System.out.println("india".equals("INDIA"));
		System.out.println("india".equalsIgnoreCase("INDIA"));
		System.out.println(str4.substring(8));
		System.out.println(str4.substring(8, 15));
		System.out.println(str4.concat(str2));
		System.out.println(str4.replace('a', '*'));
		System.out.println(str4.toUpperCase());
		String str5 = "    hello   ";
		System.out.println(str5);
		System.out.println(str5.trim());

	}

}*/



//String Buffer

/*package class1_program;

public class Prg1 {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer();
		StringBuffer s2=new StringBuffer("20");
		StringBuffer s3=new StringBuffer("welcome");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		s1.append("sd ff a aFA fasfukhjmnbvgtyy678390 rg sg asdr as d ffgfv dguyvkhujmyik");
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		s1.setLength(5);
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		System.out.println(s1);
		System.out.println(s1.reverse());
	}
}*/


//String Compare
/*package class1_program;

public class Prg1 {

	public static void main(String[] args) {
		String str = "Hello World";
		String anotherString = "hello world";
		Object objstr = str;
		
		System.out.println( str.compareTo(anotherString));
		System.out.println( str.compareToIgnoreCase(anotherString));
		System.out.println( str.compareTo(objstr.toString()));
	}
}*/




//String equals
/*package class1_program;

public class Prg1 {

	public static void main(String[] args) {
		String s1="google";
		String s2="google";
		String s3 = new String ("google");
		System.out.println(s1.equals(s2));       //compares the values
		System.out.println(s1==s2);              // compares the values and datatypes
		System.out.println(s2.equals(s3));
		System.out.println(s2==s3);
	}
}*/



//How to search the last position of a substring
/*package class1_program;

public class Prg1 {

	public static void main(String[] args) {
		String strOrig = "Hello world .Hello Reader";
		int lastIndex = strOrig.lastIndexOf("Hello");
		if(lastIndex==-1)
		{
			System.out.println("Hello not found");
		}
		else
		{
			System.out.println("Last occurrence of Hello is at index "+lastIndex);
		}
	}
}*/




//First method of  -->>  String Reverse                         
/*package class1_program;

public class Prg1 {

	public static void main(String[] args) {
		String string = "abcdef 1234";
		String reverse = new StringBuffer(string).reverse().toString();
		
		System.out.println("String before reverse: "+string);
		System.out.println("String after reverse: "+reverse);
	}
}*/




//second method  -->>  string reverse
package class1_program;

public class Prg1 {

	public static void main(String[] args) {
		String string = "abcdef 1234";
		String reverse = new StringBuffer(string).reverse().toString();
		
		System.out.println("String before reverse: "+string);
		System.out.println("String after reverse: "+reverse);
		
		String input = "abcdef";
		char[] try1 = input.toCharArray();
		
		for(int i = try1.length-1;i>=0;i--)
			System.out.print(try1[i]);
		
		
		// contains --> give boolean value
		String text = "The cat is on the Table";
		System.out.println("\n" +text.contains("the"));
		System.out.println(text.contains("these"));
	}
}