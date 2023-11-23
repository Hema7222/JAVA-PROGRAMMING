package Practice;

	import java.util.ArrayList;
	import java.util.List;
	//import java.util.Scanner;

	public class PairSumWeeklyAssessment2 {
	    public static int sumSecondElements(List<Pair<Integer, Integer>> list) {
	        int sum = 0;
	        for (Pair<Integer, Integer> pair : list) {
	            sum += pair.second;
	        }
	        return sum;
	    }

	    public static void main(String[] args) {
	    	
	    	//to get input from user:
			
	    	/*Scanner s = new Scanner(System.in);
				/*int n= s.nextInt();
				List<Pair<Integer, Integer>> pairList = new ArrayList<>();
				for(int i=0;i<n;i++) {
					int first =s.nextInt();
					int second =s.nextInt();
					pairList.add(new Pair<>(first,second));
				}
				int result = sumSecondElements(pairList);
				System.out.println(result);
				s.close();*/
	    	
	    	
	    	//Another method:
	    	List<Pair<Integer, Integer>> pairList = new ArrayList<>();
	    	pairList.add(new Pair<Integer, Integer>(1,2));
	    	pairList.add(new Pair<Integer, Integer>(3,4));
	    	pairList.add(new Pair<Integer, Integer>(5,6));
	    	pairList.add(new Pair<Integer, Integer>(7,8));
	    	pairList.add(new Pair<Integer, Integer>(9,10));
	    	
	    	
	    	System.out.println(sumSecondElements(pairList));
	    }
	    public static class Pair<F, S> {
	        F first;
	        S second;

	        public Pair(F first, S second) {
	            this.first = first;
	            this.second = second;
	        }
	    }
}


