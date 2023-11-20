package oops.hierarchical.inheritance;

public class Class4 extends Class1{
	public void test4() {
		System.out.println("Factorial: ");
		int result=1;
		for(int i=5; i>=1; i--)
		{
			result = result*i;
		}
		System.out.println(result);
	}

}
