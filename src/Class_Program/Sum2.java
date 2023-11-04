//Pgrm to find sum of the digits 
package Class_Program;

import java.util.Scanner;

public class Sum2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int remainder, sum1=0;
		while(n>0)                         //  n=35
		{
			remainder=n%10;                //   r=5                                          r=3
			n=n/10;                        //   n=3                                          n=0.3
			sum1=sum1+remainder;           //   sum1=0+5=5    second iteration: 3            sum = 5+3 = 8      
		}
		System.out.println(sum1);
		s.close();
		
		

	}

}

//Reverse the digit
/*package Class_Program;

import java.util.Scanner;

public class Sum2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int remainder;
		while(n>0)
		{
			remainder=n%10;
			n=n/10;
			//sum1=sum1+remainder;
			System.out.print(remainder);
		}
		//System.out.println(remainder);
		s.close();
		
		

	}

}*/
