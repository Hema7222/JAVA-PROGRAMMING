//Local_variable
package class1_program;

public class Main {
	int x;
	void local_var() {
		int a=2;
		a=a+7;
		System.out.println("a = "+a);
	}
	void print() {
		System.out.println("x = "+x);
		//System.out.println("a = "+a);
	}

	public static void main(String[] args) {
		
		Main s = new Main();                        //object creation
		s.local_var();
		System.out.println("x = "+s.x);

	}

}
