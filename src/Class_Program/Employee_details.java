package Class_Program;

import java.util.Scanner;

public class Employee_details {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int id, contact, Salary, net=0;
		String name, address;
		id=s.nextInt();
		name=s.next();
		s.nextLine();
		address=s.nextLine();
		contact=s.nextInt();
		Salary=s.nextInt();
		if(Salary<=20000)
		{
			net=Salary+5000;
		}
		else if(Salary<=30000)
		{
			net=Salary+7000;
		}
		else if(Salary<=40000)
		{
			net=Salary+8000;
		}
		else 
		{
			net=Salary+10000;
		}
		System.out.println("Employee id: "+id);
		System.out.println("Employee name: "+name);
		System.out.println("address: "+address);
		System.out.println("contact: "+contact);
		System.out.println("Salary: "+net);
		s.close();
	}
}
