package oops.multiple.inheritance;

public class Multiple implements Class1, Class2{
	
	@Override
	public void test3() {
		// TODO Auto-generated method stub
		int a=2,b=8;
		int c=a*b;
		System.out.println("Mul: "+c);
		
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		int a=12,b=8;
		int c=a+b;
		System.out.println("Add: "+c);
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		int a=12,b=8;
		int c=a-b;
		System.out.println("Sub: "+c);
		
	}


	public static void main(String[] args) {
		Multiple m = new Multiple();
		m.test1();
		m.test2();
		m.test3();
		

	}

	
}
