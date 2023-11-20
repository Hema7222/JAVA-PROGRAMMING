package Number_Program;

import Practice.logic;

public class RandomQuote {
		
		public static void main(String[] args) {
			String[] QUOTES = {
		            "The only way to do great work is to love what you do. - Steve Jobs",
		            "In three words I can sum up everything I've learned about life: it goes on. - Robert Frost",
		            "The future belongs to those who believe in the beauty of their dreams. - Eleanor Roosevelt",
		            "Don't watch the clock; do what it does. Keep going. - Sam Levenson",
		            "The only limit to our realization of tomorrow will be our doubts of today. - Franklin D. Roosevelt"
		    };
			//Random r = new Random();
			logic r = new logic();
	        //String randomQuote = generateRandomQuote();
	        System.out.println(r.Random(args));
	    }
	

	}


