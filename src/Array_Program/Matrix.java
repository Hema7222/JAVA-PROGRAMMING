/*package Array_Program;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int cols=a[0].length;
		int rows=a.length;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		

	}

}*/



package Array_Program;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the rows: ");
		int rows=s.nextInt();
		System.out.print("Enter the cols: ");
		int cols=s.nextInt();
		System.out.println("Enter the elements one by one: ");
		int a[][]=new int[rows][cols];
		int b[][]=new int[rows][cols];
		//int c[][]=new int[rows][cols];
		
		//input
		System.out.println("Matrix A:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++)
				a[i][j]=s.nextInt();
		}
		System.out.println("Matrix B:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++)
				b[i][j]=s.nextInt();
		}
		
		//output
		System.out.println("Array matrix A:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++)
				System.out.print(a[i][j]+" ");
		System.out.println();
		}
		
		System.out.println("Array matrix B:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++)
				System.out.print(b[i][j]+" ");
		System.out.println();
		}
		
		//result
		System.out.println("Result: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++)
				//c[i][j]=a[i][j]-b[i][j];
			System.out.print(a[i][j]-b[i][j]+" ");
		System.out.println();
		}
		s.close();
	}
}
