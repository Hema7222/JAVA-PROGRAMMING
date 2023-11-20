package oops.hybrid.inheritance;

public class Class4 extends Class2{
	
	public int test4(int n) {
		int result=1;
		for(int i=n; i>=1; i--)
		{
			result = result*i;
		}
		System.out.println(result);
		return result;
		
	}

}
