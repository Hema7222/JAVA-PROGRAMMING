package oops.hierarchical.inheritance;

public class Class3 extends Class1{
	public void test3() {
		int n=123;
		int sum=0,product=1,rem;
		
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			sum=sum+rem;
			product=product*rem;
		}
		if(sum==product)
		{
			System.out.println("123 is Spy Number");
		}
		else
		{
			System.out.println("123 is not a Spy Number");
		}
	}

}
