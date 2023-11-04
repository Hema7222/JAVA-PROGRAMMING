package Number_Program;

public class Random_Number {

	public static void main(String[] args) {
		int max=400;
		int min=200;
		System.out.println("Random value of double between "+min+" to "+max+":");
		double a=Math.random()*(max-min+1)+min;
		System.out.println(a);
		System.out.println("Random value of int between "+min+" to "+max+":");
		int b=(int)(Math.random()*(max-min+1)+min);
		System.out.println(b);
		
		
		//2nd Method:
		System.out.println("1st Random Number:" +Math.random());
		System.out.println("2nd Random Number:" +Math.random());
	}

}
