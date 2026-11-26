// Date: 25.11.2026    

// Question: https://www.geeksforgeeks.org/problems/all-divisors-of-a-number/1

import java.util.ArrayList;
import java.util.Collections;

class divisors {                                   // 12:30 pm
    public static void main(String[] args){
        int n = 20;
        ArrayList<Integer> array = new ArrayList<>();
        array = getDivisors(n);
        for(int val : array) System.out.print(val + " ");
    }
    public static ArrayList<Integer> getDivisors(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1; i*i <= n; i++){
            if(n % i == 0){
                arr.add(i);
                int pairedNum = n/i;
                
                if(i != pairedNum) arr.add(pairedNum);  // To check that our 2nd no. isn't equals to our 1st no. Therefore, to avoid duplicacy. Like if given n is 25. 
            }
        }
        Collections.sort(arr);
        return arr;
    }
}                                                // 12:40 pm
// TC : O(sq.root of n)

/* Explanation:
    So, we have n = 20. We need to check on which tables does 20 comes and at what.

    -> 1 * 20
    -> 2 * 10
    -> 4 * 5
    -> 5 * 4     // From here our numbers are going to repeat. So, we need to put a check before taking our 2nd number, i.e, pairedNum.
                // That's why the condition, "i*i <= n", is in for loop.    

    So, here, the first column is our i.
            the second column is our pairedNum. 
*/

// After doing this ques, do "sumOfDivisors" from lec-4, "my questions" folder. 