package Practice;
import java.util.Random;

public class logic {
	    public String Random(String[] arr) {
	    	//String result="";
	        Random r = new Random();	
	        return arr[r.nextInt(arr.length)];
	    }


}
