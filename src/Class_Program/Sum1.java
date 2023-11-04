//Pgrm to find sum of n natural number
package Class_Program;

import java.util.Scanner;

public class Sum1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int result=0;
		for(int i=1; i<=n; i++) {
			result = result+i;
		}
		System.out.println("Sum = "+result);
		s.close();

	}

}


//sum of 2 digits:
/*int a=199,sum;
int b=1;
sum=a+b;
System.out.println("sum: "+sum);*/
