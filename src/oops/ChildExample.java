package oops;

public class ChildExample extends ParentExample {
	
	public ChildExample() {
		super();                
	}
	
	@Override
	public String test() {
		super.test();
		return "testing";
	}
	
	public int test2(int m) {
		return m;
	}
}
