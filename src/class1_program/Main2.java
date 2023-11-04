/*package class1_program;

public class Main2 {
	int emp_id;                     //class variable
	String emp_name;
	double Salary;
	
	void setEmp() 
	{
		emp_id=1;
		emp_name="HP";
		Salary=10000;
	}
	
	void getEmp()
	{
		System.out.println("Employee id: "+emp_id);
		System.out.println("Employee name: "+emp_name);
		System.out.println("Salary: "+Salary);
	}

	public static void main(String[] args) {
		Main2 ob = new Main2();
		System.out.println("State emp_id: "+ob.emp_id);
		System.out.println("Getter Method Calling");
		ob.getEmp();
		System.out.println("Setter Method Calling");
		ob.setEmp();
		System.out.println("Calling get method after set method: ");
		

	}

}*/



//setter and getter
/*package class1_program;

public class Main2 {
	static int emp_id;                     //class variable
	static String emp_name;
	static double Salary;
	
	static void setEmp() 
	{
		emp_id=1;
		emp_name="HP";
		Salary=10000;
	}
	
	void getEmp()
	{
		System.out.println("Employee id: "+emp_id);
		System.out.println("Employee name: "+emp_name);
		System.out.println("Salary: "+Salary);
	}

	public static void main(String[] args) {
		Main2 ob = new Main2();
		System.out.println("State emp_id: "+emp_id);
		System.out.println("Getter Method Calling");
		ob.getEmp();
		System.out.println("Setter Method Calling");
		setEmp();
		System.out.println("Calling get method after set method: ");
		

	}

}*/


//constructor
package class1_program;

public class Main2 {
	int emp_id;                     //instance variable
	String emp_name;                //class variable
	double Salary;                  //class variable
	
	public Main2()                  //method name:Main2      Access Modifier:public/protected/private
	{
		emp_id=1;                   //initializing values
		emp_name="HP";
		Salary=10000;
	}
	
	void getEmp()
	{
		System.out.println("Employee id: "+emp_id);
		System.out.println("Employee name: "+emp_name);
		System.out.println("Salary: "+Salary);
	}

	public static void main(String[] args) {
		Main2 ob = new Main2();                           
		System.out.println("State emp_id: "+ob.emp_id);
		System.out.println("Getter Method Calling");
		ob.getEmp();
		System.out.println("Calling get method after set method: ");
		

	}

}
