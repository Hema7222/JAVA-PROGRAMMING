package oops;

public class ParentExample {
	int j=0,k=10;
	String s = "Nothing";
	public ParentExample() {
		
	}
	
	public ParentExample(int n) {        //Method Overloading -> class name same but different arguments
		this.j=n;
	}
	
	public ParentExample(String s) {     //Method Overloading -> class name same but different arguments
		this.s=s;
	}
	
	public  int  primeNumber() {
		return j;
	}
	
	public int primeNumber1() {
		return k;
	}
	
	public String test() {
		j=32;
		return s;
	}

}
