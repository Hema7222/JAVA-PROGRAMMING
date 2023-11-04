package Class_Program;

import java.util.Scanner;

public class Peterson_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=s.nextInt();
		int r,result=1,sum=0,temp=n;
		
		while(n>0)
		{
			r=n%10;                                   // [r = 145%10 =5]   second_iteration: [r=14%10 = 4]   third_iteration:  [r=1%10 = 1]
			result=1;                 
			for(int i=r;i>0;i--)                      //[i=5; 5>0; 5-- = 4], [i=4; 4>0; 4-- = 3], [i=3; 3>0; 3-- = 2], [i=2; 2>0; 2-- = 1], [i=1; 1>0; 1-- = 0]
			{
				result=result*i;                      //  5=5*4*3*2*1  -->  5!=120   second_iteration: [4! = 24]    third_iteration:  [1! = 1]
			}
				
			sum=sum+result;                          // sum=0+120 = 120    second_iteration:  [sum=120+24 = 144]      third_iteration: [sum=144+1 = 145]
			n=n/10;                                  // n=145/10  = 14     second_iteration:  [n=14/10 = 1]           third_iteration: [n=1/10 = 0]
		}
		if(sum==temp)
		{
			System.out.println("Peterson Number");
		}
		else
		{
			System.out.println("Not a Peterson Number");
		}
		
		s.close();

	}

}
/*import java.util.Scanner;
public class Peterson_Number 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      //taking input from the user 
      System.out.println("Enter the number");
        int num=sc.nextInt();
        int temp=num;//storing the number in a temporary variable
        int f=1,sum=0;
        while(num!=0)//running while loop until number becomes zero
        {
            f=1;
          //extracting last digit of the number 
          //and storing in r
            int r=num%10;
          //for loop to find the factorial of a digit
            for(int i=1;i<=r;i++)
            {
                f=f*i;
            }
            sum=sum+f;//adding the factotial of the digits
            num=num/10;
        }
      //checking if the sum of the factorial of digits 
      //is equal to the number or not
        if(sum==temp)
        System.out.println("PETERSON NUMBER");
        else
        System.out.println("NOT PETERSON NUMBER");
        
    }
    }*/
