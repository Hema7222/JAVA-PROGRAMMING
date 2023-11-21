package Practice;

import java.util.Random;

public class RandomQuote {
    public int Random(String[] args) {
    	String[] quotes = {
                "The only way to do great work is to love what you do. - Steve Jobs",
                "In the middle of difficulty lies opportunity. - Albert Einstein",
                "The future belongs to those who believe in the beauty of their dreams. - Eleanor Roosevelt",
                "Success is not final, failure is not fatal: It is the courage to continue that counts. - Winston Churchill",
                "The only limit to our realization of tomorrow will be our doubts of today. - Franklin D. Roosevelt"
            };

        // Generate a random index
        Random random = new Random();
        int randomIndex = random.nextInt(quotes.length);

        // Print the random quote
        System.out.println("Random Quote: " + quotes[randomIndex]);
		return randomIndex;
    }
}

