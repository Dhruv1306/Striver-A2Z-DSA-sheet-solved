// Date: 25.11.2026    

// Question: https://leetcode.com/problems/count-primes/

class countPrimes {
    public static void main(String[] args){
        int n = 10;
        System.out.print(count(n));
    }

    // Normal Solution
//    public static int count(int n) {
//         int count = 0;
//         for(int i=2; i < n; i++){            // Prime number starts from 2
//             boolean isPrime = true;
//             for(int j=2; j*j <= i; j++){
//                 if(i%j == 0){
//                     isPrime = false;
//                     break;
//                 }
//             }
//             if(isPrime) count++;
//         }
//         return count;
//     }

    // Optimized Solution (Sieve of Eratosthenes)
    public static int count(int n) {
        if(n < 2) return 0;                            // check 
        boolean[] composites = new boolean[n];        // non-prime no. are called as composite no.
        int count = 0;
        for(int i=2; i<n; i++){      // At starting, the whole array is filled with "False"
            if(composites[i] == false){
                count++;
                // and then mark all the multiples of i as "True"
                for(int j=2; i*j<n; j++){  // i will act as the "table number" & j will be the 2nd no. to multiple i with
                // so, in first iteration, when i=2, then inside the 2nd loop, we are doing table of 2.
                composites[i*j] = true;
                }
            }
        }
        return count;
    }
}
// So, indices with "true" values are composites / non-prime no. 
// and indices with "False" values are prime no. 

// NOTE: The inner loop only runs when i is prime, otherwise it'll get skipped.