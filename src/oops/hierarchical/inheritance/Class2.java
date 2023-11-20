package oops.hierarchical.inheritance;

public class Class2 extends Class1{
	
	public void test2() {
		System.out.println("Fibonacci Series: ");
		int f1=0,f2=1,f3;
		System.out.print(f1+" "+f2+" ");
		
		for(int j=2;j<=10;j++)
		{
			f3=f1+f2;
			System.out.print(f3+" ");
			f1=f2;
			f2=f3;
			
		}
	}
}
