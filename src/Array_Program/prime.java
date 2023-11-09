package Array_Program;

public class prime {
	public static void main(String[] args) {
		int arr[]= {13,17,21,31,5,99991,23,25};
		int count=0;
		PrimeNumber s = new PrimeNumber();             //object creation
		System.out.println(""+s.prime(arr,count));     // calling arguments from main program to print 
	}
}
