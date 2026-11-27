// Date: 26.11.2026    

// Question: https://www.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548/1

import java.util.ArrayList;

class factorial2 {
    public static void main(String[] args){
        long n = 3;
        ArrayList<Long> arr = new ArrayList<>();
        arr = factorialNumbers(n);
        System.out.print(arr);                                  // It'll print like an array
        // for(long val : arr) System.out.print(val + " ");    // It will print like values
    }

    // Normal approach
    // public static ArrayList<Long> factorialNumbers(long n){
    //     if(n == 0) return new ArrayList<>();   // edge case
    //     if(n == 1) return new ArrayList<>(List.of(1L));  // edge case    cause ques. asks for less than or equals to n.
        
    //     ArrayList<Long> arr = new ArrayList<>();
    //     arr.add(1L);
    //     long fact = 1L;
    //     for(int i=2; i<=n; i++){
    //         if(fact > n/i) return arr;    // Prevents overflow & stops once next factorial > n
    //         long temp = fact * i;
    //         arr.add(temp);
    //         fact = temp;
    //     }
    //     return arr;  // Required so all code paths return a value
    // }

    // Recursion approach
    public static ArrayList<Long> factorialNumbers(long n){
        ArrayList<Long> arr = new ArrayList<>();
        generateFactorial(n, 1L, 2L, arr);
        return arr;
    }
    public static void generateFactorial(long n, long fact, long next, ArrayList<Long> arr){
        if(fact > n) return;       // Base cond.
        arr.add(fact);
        
        // Guard against long overflow before multiplying for the next factorial
        if (fact > n / next) return;

        generateFactorial(n, fact * next, next + 1, arr);
    }
}
// TC of both approaches is O(k), where, k is the number of factorial numbers <= n