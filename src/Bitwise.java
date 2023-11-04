
/*public class Bitwise {

	public static void main(String[] args) {
		int a = 20, b = 5, c = 2;
		System.out.println("Relational operator");
		System.out.println(a>b && a>c);
		System.out.println(b>a || b>c);
		System.out.println(!(a>b));
		System.out.println("Assignment Operator");
		a+=2;
		System.out.println("a+= "+a);
		b-=10;
		System.out.println("b-= "+b);
		a*=3;
		System.out.println("a*= "+a);
		c/=2;
		System.out.println("c/= "+c);
		System.out.println("Bitwise Operator");
		a=9;
		System.out.println("a=9 assigned "+a);
		a++;
		System.out.println("a++ increment "+a);
		System.out.println("a>>1 = "+(a>>1));
		System.out.println("a>>>1 = "+(a>>>1));
		b=5;
		System.out.println("b<<1 = "+(b<<1));
		System.out.println("b<<2 = "+(b<<2));
		System.out.println("~a ="+(~a));	
	}
}*/
public class Bitwise {

	public static void main(String[] args) {
		int a = 5, b = 20, result;
		result = (a>b)?a:b;
		System.out.println("Biggest Number = "+result);
	}
}
	
