//xxxValue -->>  Number
/*package class1_program;

public class pgrm2 {

	public static void main(String[] args) {
		
		//to convert one datatype to another datatype : make it as a class objects
		Integer x=20;
		
		Float f = x.floatValue();
		System.out.println("Integer x = "+x);
		System.out.println("Float value f = "+f);

	}

}*/




package class1_program;

public class pgrm2 {

	public static void main(String[] args) {
		//to convert one datatype to another datatype : make it as a class objects
		Integer x=20;
				
		Float f = x.floatValue();
		System.out.println("Integer x = "+x);
		System.out.println("Float value f = "+f);
		
		String str ="10";       //primitive datatype
		//converting string into int
		
		Integer y = Integer.parseInt(str);
		Double d = y.doubleValue();
		System.out.println("y = "+y);
		System.out.println("d = "+d);
		System.out.println(d.toString());
		
		//converting int into string  -  class objects type casting
		System.out.println(String.valueOf(y));
		
		System.out.println(Math.abs(10-20));      // display the difference
		System.out.println(Math.ceil(12.34));     //higher value
		System.out.println(Math.floor(12.34));    // lower value
		System.out.println(Math.round(12.54));    // according to decimal
		System.out.println(Math.pow(9,3));        // 1st num to the pow of 2nd num
		
		
		
		Integer num1 = 1;
		Integer num2=10;
		System.out.println(num1.compareTo(num2));
		System.out.println(num2.equals(num2));
		
		String a = "hello";
		String b = "hello";
		if(a.equals(b))
		{
			System.out.println("both string are equal");
		}
		if(a.compareTo(b)==0)
			System.out.println("both string are equal");
		
		System.out.println(Math.min(12, 20));
		System.out.println(Math.max(12, 20));
		
		
		
		//converting integer into string
		Integer int1=20;
		System.out.println(String.valueOf(int1));
		System.out.println(int1.floatValue());
		System.out.println(int1.doubleValue());
	}
}
	
