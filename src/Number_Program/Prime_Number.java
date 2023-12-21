package Number_Program;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");     //n=11
		int n=s.nextInt();
		for(int i=2;i<n;i++)                        //[2<11; 2++] [3<11; 3++] [4<11; 4++].....[10<11; 10++] [11<11] not satisfied
		{
			@SuppressWarnings("unused")
			int flag=0;
			if(n%2==0)                              //[11%2==1]  [11%3==2]  [11%4==3].....[11%10==1] [11%11==0]  it will fail and go to break
			{
				flag++;
				break;                                     
			}
		}
		if(n==0||n==1)
		{
			System.out.println(n+ " Not a Prime Number");
		}
		else 
		{
			System.out.println(n+ " Prime Number");
		}
	
		s.close();
	}

}






























