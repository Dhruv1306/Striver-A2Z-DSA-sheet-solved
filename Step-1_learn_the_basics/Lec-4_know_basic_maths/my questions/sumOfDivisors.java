// Date: 18.11.2026    

// Question: https://www.geeksforgeeks.org/problems/sum-of-all-divisors-from-1-to-n4738/1

// Note: In this question, we need to find the SUM of ALL DIVISORS for F(i). 

class sumOfDivisors {             // 1:03 pm  
    public static void main(String[] args){
        long n = 4;
        System.out.print(sum(n));
    }    
    public static long sum(long n) {
        if(n == 1) return 1;
        long result = 1;                // F(1)
        
        for(int i=2; i<=n; i++){    // from F(2)...                   // TC: O(n)
            long sum = 0;
            for(int j=1; j*j <= i; j++){    // to find all the divisors of i   // TC: o(Sq.root of n)
                if(i % j == 0){
                    sum += j;
                    long pairedNum = i / j;
                    
                    if(j != pairedNum) sum += pairedNum;    // to avoid adding duplicate numbers, suppose if i=25.
                }
            }
            result += sum;
        }
        return result;
    }
}                                       // 1:18 pm

// TC :  O(n sq.root of n)