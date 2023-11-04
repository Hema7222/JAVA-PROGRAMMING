package class1_program;

import java.util.Scanner;

public class Basic {
	int stud_id;                                            //class variable = state
	String stud_name;
	
	void print(int id1, String name1)                                              //method
	{
		stud_id=id1;
		stud_name=name1;
		System.out.println("student id: "+stud_id);
		System.out.println("student Name: "+stud_name);
	}

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.print("Enter the Student id: ");
		int id=s.nextInt();
		System.out.print("Enter the Student Name: ");
		String name=s.next();
		Basic obj = new Basic();
		obj.print(id,name);                                        // calling the method print
		s.close();

	}

}
