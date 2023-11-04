//pgrm to get stud id, stud name, marks using if statement
package Class_Program;

import java.util.Scanner;

public class Student_details {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int id, m1, m2, m3, total, average;
		String name;
		System.out.println("Student id: ");
		id = s.nextInt();
		System.out.println("Student name: ");
		name=s.next();
		System.out.println("Mark1: ");
		m1=s.nextInt();
		System.out.println("Mark2: ");
		m2=s.nextInt();
		System.out.println("Mark3: ");
		m3=s.nextInt();
		total=m1+m2+m3;
		average=total/3;
		
		System.out.println("Student id: "+id);
		System.out.println("Student name: "+name);
		System.out.println("Mark1: "+m1);
		System.out.println("Mark2: "+m2);
		System.out.println("Mark3: "+m3);
		System.out.println("Total = "+total);
		System.out.println("Average = "+average);
		if(average>=90)
		{
			System.out.println("Remarks: Excellent");
		}
		else if(average>=80)
		{
			System.out.println("Remarks: Very Good");
		}
		else if(average>=70)
		{
			System.out.println("Remarks: Good");
		}
		else if(average>=60)
		{
			System.out.println("Remarks: Has to improve");
		}
		else if(average>=50)
		{
			System.out.println("Remarks: Work Hard");
		}
		else 
		{
			System.out.println("Remarks: Fail");
		}
		s.close();
	}

}
