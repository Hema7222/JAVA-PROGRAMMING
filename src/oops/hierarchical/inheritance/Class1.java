package oops.hierarchical.inheritance;

public class Class1 {
	public void test1() {
		int n=153;
		int r,sum=0,temp=n;
		String str = String.valueOf(n);
		int l=str.length();
		while(n>0)
		{
			r=n%10;
			sum=(int) (sum + Math.pow(r, l));
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("153 is Amstrong Number");
		}
		else
		{
			System.out.println("153 is not an Amstrong Number");
		}
	}

}
