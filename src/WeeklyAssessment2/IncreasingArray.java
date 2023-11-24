/*Abhijit has an Array Arr which may or may not be in strictly increasing order. 
 He wants to make this array increasing but does not wish to change the position of any element 
 so he came with an idea that he will replace an element with any of its divisors 
 i.e he changes an element X to M if X%M=0.

Your task is to tell whether the given array can be transformed to strictly increasing by performing 
the operation given above.

First line of input contains the size of the array N. Next line of input contains N space- separated integers 
depicting the values of the array Arr.


Constraints:-
1 <= N <= 100000
1 <= Arr[i] <= 100000 Print “YES” if the array can be transformed in the strictly increasing order else print “NO”.

Sample Input:-

 5
 1 2 16 16 16 
Sample Output:-

YES*/

package WeeklyAssessment2;

import java.util.Scanner;

public class IncreasingArray {
	public static String canBeTransformed(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] <= arr[i - 1]) {
                // Find a divisor for the current element
                boolean found = false;
                for (int j = 1; j * j <= arr[i]; j++) {
                    if (arr[i] % j == 0) {
                        if (j > arr[i - 1] || (arr[i] / j) > arr[i - 1]) {
                            found = true;
                            break;
                        }
                    }
                }

                if (!found) {
                    return "NO";
                }
            }
        }

        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        String result = canBeTransformed(arr, n);
        System.out.println(result);
        sc.close();
    }

}
