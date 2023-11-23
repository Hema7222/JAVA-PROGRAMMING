package WeeklyAssessment2;

import java.util.Scanner;

public class PalindromeCheck {
	public static int isPalindrome(String s) {
        int n = s.length();
        int i = 0, j = n - 1;

        
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return 0; // Not a palindrome
            }
            i++;
            j--;
        }

        return 1; // Palindrome
    }
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();
	        int result = isPalindrome(s);

	        System.out.println(result);
	        sc.close();

	}


}
